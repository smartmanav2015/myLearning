

drop table stock_detail;
drop table stock;
CREATE TABLE stock (
STOCK_ID NUMBER(10,0) NOT NULL,
STOCK_CODE VARCHAR2(50 BYTE),
STOCK_NAME VARCHAR2(50 BYTE),
CONSTRAINT STOCK_ID_pk PRIMARY KEY (STOCK_ID),
CONSTRAINT stock_unique UNIQUE (STOCK_CODE, STOCK_NAME)
);


CREATE TABLE stock_detail (
STOCK_ID NUMBER(10,0) NOT NULL,
COMP_NAME VARCHAR2(50 BYTE),
COMP_DESC VARCHAR2(50 BYTE),
REMARK VARCHAR2(255 BYTE),
LISTED_DATE VARCHAR2(50 BYTE),
CONSTRAINT STOCK_ID__det_pk PRIMARY KEY (STOCK_ID),
CONSTRAINT FK_STOCK_ID FOREIGN KEY (STOCK_ID) REFERENCES stock(STOCK_ID)
);






/*
CREATE TABLE stock_detail (
  `STOCK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `COMP_NAME` varchar(100) NOT NULL,
  `COMP_DESC` varchar(255) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `LISTED_DATE` date NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  CONSTRAINT `FK_STOCK_ID` FOREIGN KEY (`STOCK_ID`) REFERENCES `stock` (`STOCK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8;



BirthDate VARCHAR2(50 BYTE),
Photo VARCHAR2(50 BYTE),
Notes VARCHAR2(500 BYTE));
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 1, 'Davolio ', 'Nancy ', '12/8/1968 ', 'EmpID1.pic ', 'Education includes a BA in psychology from Colorado State University. She also completed (The Art of the Cold Call). Nancy is a member of Toastmasters International. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 2, 'Fuller ', 'Andrew ', '2/19/1952 ', 'EmpID2.pic ', 'Andrew received his BTS commercial and a Ph.D. in international marketing from the University of Dallas. He is fluent in French and Italian and reads German. He joined the company as a sales representative, was promoted to sales manager and was then named vice president of sales. Andrew is a member of the Sales Management Roundtable, the Seattle Chamber of Commerce, and the Pacific Rim Importers Association. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 3, 'Leverling ', 'Janet ', '8/30/1963 ', 'EmpID3.pic ', 'Janet has a BS degree in chemistry from Boston College). She has also completed a certificate program in food retailing management. Janet was hired as a sales associate and was promoted to sales representative. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 4, 'Peacock ', 'Margaret ', '9/19/1958 ', 'EmpID4.pic ', 'Margaret holds a BA in English literature from Concordia College and an MA from the American Institute of Culinary Arts. She was temporarily assigned to the London office before returning to her permanent post in Seattle. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 5, 'Buchanan ', 'Steven ', '3/4/1955 ', 'EmpID5.pic ', 'Steven Buchanan graduated from St. Andrews University, Scotland, with a BSC degree. Upon joining the company as a sales representative, he spent 6 months in an orientation program at the Seattle office and then returned to his permanent post in London, where he was promoted to sales manager. Mr. Buchanan has completed the courses Successful Telemarketing and International Sales Management. He is fluent in French. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 6, 'Suyama ', 'Michael ', '7/2/1963 ', 'EmpID6.pic ', 'Michael is a graduate of Sussex University (MA, economics) and the University of California at Los Angeles (MBA, marketing). He has also taken the courses Multi-Cultural Selling and Time Management for the Sales Professional. He is fluent in Japanese and can read and write French, Portuguese, and Spanish. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 7, 'King ', 'Robert ', '5/29/1960 ', 'EmpID7.pic ', 'Robert King served in the Peace Corps and traveled extensively before completing his degree in English at the University of Michigan and then joining the company. After completing a course entitled Selling in Europe, he was transferred to the London office. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 8, 'Callahan ', 'Laura ', '1/9/1958 ', 'EmpID8.pic ', 'Laura received a BA in psychology from the University of Washington. She has also completed a course in business French. She reads and writes French. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 9, 'Dodsworth ', 'Anne ', '7/2/1969 ', 'EmpID9.pic ', 'Anne has a BA degree in English from St. Lawrence College. She is fluent in French and German. ' );
insert into employees ( EmployeeID, LastName, FirstName, BirthDate, Photo, Notes ) VALUES ( 10, 'West ', 'Adam ', '9/19/1928 ', 'EmpID10.pic ', 'An old chum ' );

*/




