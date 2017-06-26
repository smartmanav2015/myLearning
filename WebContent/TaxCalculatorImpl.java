package com.ubs.tax.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ubs.tax.common.TaxUtil;
import com.ubs.tax.entity.IncomeRequest;
import com.ubs.tax.exception.TaxException;

public class TaxCalculatorImpl implements ITaxCalculator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ubs.tax.service.ITaxCalculator#calculateInterest(com.ubs.tax.entity
	 * .IncomeRequest)
	 */
	@Override
	public BigDecimal calculateInterest(IncomeRequest req) {

		BigDecimal principal = req.getPrincipal();

		if (!TaxUtil.isEmpty(principal)) {

			List<BigDecimal> taxValueList = TaxUtil.getTaxValuesAsList();
			List<BigDecimal> slabList = TaxUtil.getSlabValuesAsList();

			List<BigDecimal> brokenPrincipal = breakPrincipal(principal,slabList);

			BigDecimal interest = new BigDecimal(0);
			BigDecimal finalInterest = new BigDecimal(0);

			for (int i = 0; i < slabList.size(); i++) {

				BigDecimal principalAmount = brokenPrincipal.get(i);
				BigDecimal rate = taxValueList.get(i);

				interest = principalAmount.multiply(rate);

				finalInterest = finalInterest.add(interest
						.divide(new BigDecimal(100)));
			}

			return interest;
		} else {
			throw new TaxException("Principal can't be NULL");
		}
	}

	/**
	 * @param principal
	 * @param slabList
	 * @return
	 */
	private List<BigDecimal> breakPrincipal(BigDecimal principal, List<BigDecimal> slabList) {

		List<BigDecimal> breakUpList = new ArrayList<BigDecimal>();

		BigDecimal leftOverPrincipal = null;

		for (int i = 0; i < slabList.size(); i++) {

			BigDecimal slab = slabList.get(i);
			leftOverPrincipal = principal.subtract(slab);

			if (leftOverPrincipal.compareTo(BigDecimal.ZERO) < 0) { // Proves value is negative and so no forther breaking needed 
				break;
			}
			breakUpList.add(slab);
			principal = leftOverPrincipal;
		}

		if (principal.compareTo(BigDecimal.ZERO) > 0) {
			breakUpList.add(principal);
		}

		System.out.println("breakUpList --> " + breakUpList.toString());

		return breakUpList;

	}

	public static void main(String args[]) {

		BigDecimal b = null;

		IncomeRequest req = new IncomeRequest(new BigDecimal(100000), null);
		TaxCalculatorImpl service = new TaxCalculatorImpl();
		b = service.calculateInterest(req);
		System.out.println("aakash --> " + b);

	}

	/*
	 * BigDecimal divisor = principal.divide(slab); if (divisor.intValue() >= 1)
	 * { breakUpList.add(slab); principal = principal.subtract(slab); } else {
	 * breakUpList.add(principal); break; }
	 */

}
