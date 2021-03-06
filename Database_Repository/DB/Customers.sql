drop table customers;
CREATE TABLE customers (
    CUSTOMERID   NUMBER(10,0) NOT NULL,
    CUSTOMERNAME VARCHAR2(50 BYTE),
    CONTACTNAME  VARCHAR2(50 BYTE),
    ADDRESS      VARCHAR2(50 BYTE),
    CITY         VARCHAR2(50 BYTE),
    POSTALCODE   VARCHAR2(50 BYTE),
    COUNTRY      VARCHAR2(50 BYTE) 
);
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 1, 'Alfreds Futterkiste�', 'Maria Anders�', 'Obere Str. 57�', 'Berlin�', 12209, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 2, 'Ana Trujillo Emparedados y helados�', 'Ana Trujillo�', 'Avda. de la Constituci�n 2222�', 'M�xico D.F.�', 5021, 'Mexico�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 3, 'Antonio Moreno Taquer�a�', 'Antonio Moreno�', 'Mataderos 2312�', 'M�xico D.F.�', 5023, 'Mexico�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 4, 'Around the Horn�', 'Thomas Hardy�', '120 Hanover Sq.�', 'London�', 'WA1 1DP�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 5, 'Berglunds snabbk�p�', 'Christina Berglund�', 'Berguvsv�gen 8�', 'Lule�', 'S-958 22�', 'Sweden�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 6, 'Blauer See Delikatessen�', 'Hanna Moos�', 'Forsterstr. 57�', 'Mannheim�', 68306, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 7, 'Blondel p�re et fils�', 'Fr�d�rique Citeaux�', '24, place Kl�ber�', 'Strasbourg�', 67000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 8, 'B�lido Comidas preparadas�', 'Mart�n Sommer�', 'C/ Araquil, 67�', 'Madrid�', 28023, 'Spain�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 9, 'Bon app�', 'Laurence Lebihans�', '12, rue des Bouchers�', 'Marseille�', 13008, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 10, 'Bottom-Dollar Marketse�', 'Elizabeth Lincoln�', '23 Tsawassen Blvd.�', 'Tsawassen�', 'T2F 8M4�', 'Canada�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 11, 'Bs Beverages�', 'Victoria Ashworth�', 'Fauntleroy Circus�', 'London�', 'EC2 5NT�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 12, 'Cactus Comidas para llevar�', 'Patricio Simpson�', 'Cerrito 333�', 'Buenos Aires�', 1010, 'Argentina�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 13, 'Centro comercial Moctezuma�', 'Francisco Chang�', 'Sierras de Granada 9993�', 'M�xico D.F.�', 5022, 'Mexico�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 14, 'Chop-suey Chinese�', 'Yang Wang�', 'Hauptstr. 29�', 'Bern�', 3012, 'Switzerland�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 15, 'Com�rcio Mineiro�', 'Pedro Afonso�', 'Av. dos Lus�adas, 23�', 'S�o Paulo�', '05432-043�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 16, 'Consolidated Holdings�', 'Elizabeth Brown�', 'Berkeley Gardens 12 Brewery �', 'London�', 'WX1 6LT�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 17, 'Drachenblut Delikatessend�', 'Sven Ottlieb�', 'Walserweg 21�', 'Aachen�', 52066, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 18, 'Du monde entier�', 'Janine Labrune�', '67, rue des Cinquante Otages�', 'Nantes�', 44000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 19, 'Eastern Connection�', 'Ann Devon�', '35 King George�', 'London�', 'WX3 6FW�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 20, 'Ernst Handel�', 'Roland Mendel�', 'Kirchgasse 6�', 'Graz�', 8010, 'Austria�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 21, 'Familia Arquibaldo�', 'Aria Cruz�', 'Rua Or�s, 92�', 'S�o Paulo�', '05442-030�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 22, 'FISSA Fabrica Inter. Salchichas S.A.�', 'Diego Roel�', 'C/ Moralzarzal, 86�', 'Madrid�', 28034, 'Spain�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 23, 'Folies gourmandes�', 'Martine Ranc�', '184, chauss�e de Tournai�', 'Lille�', 59000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 24, 'Folk och f� HB�', 'Maria Larsson�', '�kergatan 24�', 'Br�cke�', 'S-844 67�', 'Sweden�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 25, 'Frankenversand�', 'Peter Franken�', 'Berliner Platz 43�', 'M�nchen�', 80805, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 26, 'France restauration�', 'Carine Schmitt�', '54, rue Royale�', 'Nantes�', 44000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 27, 'Franchi S.p.A.�', 'Paolo Accorti�', 'Via Monte Bianco 34�', 'Torino�', 10100, 'Italy�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 28, 'Furia Bacalhau e Frutos do Mar�', 'Lino Rodriguez �', 'Jardim das rosas n. 32�', 'Lisboa�', 1675, 'Portugal�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 29, 'Galer�a del gastr�nomo�', 'Eduardo Saavedra�', 'Rambla de Catalu�a, 23�', 'Barcelona�', 8022, 'Spain�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 30, 'Godos Cocina T�pica�', 'Jos� Pedro Freyre�', 'C/ Romero, 33�', 'Sevilla�', 41101, 'Spain�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 31, 'Gourmet Lanchonetes�', 'Andr� Fonseca�', 'Av. Brasil, 442�', 'Campinas�', '04876-786�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 32, 'Great Lakes Food Market�', 'Howard Snyder�', '2732 Baker Blvd.�', 'Eugene�', 97403, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 33, 'GROSELLA-Restaurante�', 'Manuel Pereira�', '5� Ave. Los Palos Grandes�', 'Caracas�', 1081, 'Venezuela�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 34, 'Hanari Carnes�', 'Mario Pontes�', 'Rua do Pa�o, 67�', 'Rio de Janeiro�', '05454-876�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 35, 'HILARI�N-Abastos�', 'Carlos Hern�ndez�', 'Carrera 22 con Ave. Carlos Soublette #8-35�', 'San Crist�bal�', 5022, 'Venezuela�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 36, 'Hungry Coyote Import Store�', 'Yoshi Latimer�', 'City Center Plaza 516 Main St.�', 'Elgin�', 97827, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 37, 'Hungry Owl All-Night Grocers�', 'Patricia McKenna�', '8 Johnstown Road�', 'Cork�', Null, 'Ireland�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 38, 'Island Trading�', 'Helen Bennett�', 'Garden House Crowther Way�', 'Cowes�', 'PO31 7PJ�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 39, 'K�niglich Essen�', 'Philip Cramer�', 'Maubelstr. 90�', 'Brandenburg�', 14776, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 40, 'La corne dabondance�', 'Daniel Tonini�', '67, avenue de lEurope�', 'Versailles�', 78000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 41, 'La maison dAsie�', 'Annette Roulet�', '1 rue Alsace-Lorraine�', 'Toulouse�', 31000, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 42, 'Laughing Bacchus Wine Cellars�', 'Yoshi Tannamuri�', '1900 Oak St.�', 'Vancouver�', 'V3F 2K1�', 'Canada�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 43, 'Lazy K Kountry Store�', 'John Steel�', '12 Orchestra Terrace�', 'Walla Walla�', 99362, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 44, 'Lehmanns Marktstand�', 'Renate Messner�', 'Magazinweg 7�', 'Frankfurt a.M. �', 60528, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 45, 'Lets Stop N Shop�', 'Jaime Yorres�', '87 Polk St. Suite 5�', 'San Francisco�', 94117, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 46, 'LILA-Supermercado�', 'Carlos Gonz�lez�', 'Carrera 52 con Ave. Bol�var #65-98 Llano Largo�', 'Barquisimeto�', 3508, 'Venezuela�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 47, 'LINO-Delicateses�', 'Felipe Izquierdo�', 'Ave. 5 de Mayo Porlamar�', 'I. de Margarita�', 4980, 'Venezuela�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 48, 'Lonesome Pine Restaurant�', 'Fran Wilson�', '89 Chiaroscuro Rd.�', 'Portland�', 97219, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 49, 'Magazzini Alimentari Riuniti�', 'Giovanni Rovelli�', 'Via Ludovico il Moro 22�', 'Bergamo�', 24100, 'Italy�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 50, 'Maison Dewey�', 'Catherine Dewey�', 'Rue Joseph-Bens 532�', 'Bruxelles�', 'B-1180�', 'Belgium�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 51, 'M�re Paillarde�', 'Jean Fresni�re�', '43 rue St. Laurent�', 'Montr�al�', 'H1J 1C3�', 'Canada�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 52, 'Morgenstern Gesundkost�', 'Alexander Feuer�', 'Heerstr. 22�', 'Leipzig�', 4179, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 53, 'North/South�', 'Simon Crowther�', 'South House 300 Queensbridge�', 'London�', 'SW7 1RZ�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 54, 'Oc�ano Atl�ntico Ltda.�', 'Yvonne Moncada�', 'Ing. Gustavo Moncada 8585 Piso 20-A�', 'Buenos Aires�', 1010, 'Argentina�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 55, 'Old World Delicatessen�', 'Rene Phillips�', '2743 Bering St.�', 'Anchorage�', 99508, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 56, 'Ottilies K�seladen�', 'Henriette Pfalzheim�', 'Mehrheimerstr. 369�', 'K�ln�', 50739, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 57, 'Paris sp�cialit�s�', 'Marie Bertrand�', '265, boulevard Charonne�', 'Paris�', 75012, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 58, 'Pericles Comidas cl�sicas�', 'Guillermo Fern�ndez�', 'Calle Dr. Jorge Cash 321�', 'M�xico D.F.�', 5033, 'Mexico�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 59, 'Piccolo und mehr�', 'Georg Pipps�', 'Geislweg 14�', 'Salzburg�', 5020, 'Austria�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 60, 'Princesa Isabel Vinhoss�', 'Isabel de Castro�', 'Estrada da sa�de n. 58�', 'Lisboa�', 1756, 'Portugal�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 61, 'Que Del�cia�', 'Bernardo Batista�', 'Rua da Panificadora, 12�', 'Rio de Janeiro�', '02389-673�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 62, 'Queen Cozinha�', 'L�cia Carvalho�', 'Alameda dos Can�rios, 891�', 'S�o Paulo�', '05487-020�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 63, 'QUICK-Stop�', 'Horst Kloss�', 'Taucherstra�e 10�', 'Cunewalde�', 1307, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 64, 'Rancho grande�', 'Sergio Guti�rrez�', 'Av. del Libertador 900�', 'Buenos Aires�', 1010, 'Argentina�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 65, 'Rattlesnake Canyon Grocery�', 'Paula Wilson�', '2817 Milton Dr.�', 'Albuquerque�', 87110, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 66, 'Reggiani Caseifici�', 'Maurizio Moroni�', 'Strada Provinciale 124�', 'Reggio Emilia�', 42100, 'Italy�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 67, 'Ricardo Adocicados�', 'Janete Limeira�', 'Av. Copacabana, 267�', 'Rio de Janeiro�', '02389-890�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 68, 'Richter Supermarkt�', 'Michael Holz�', 'Grenzacherweg 237�', 'Gen�ve�', 1203, 'Switzerland�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 69, 'Romero y tomillo�', 'Alejandra Camino�', 'Gran V�a, 1�', 'Madrid�', 28001, 'Spain�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 70, 'Sant� Gourmet�', 'Jonas Bergulfsen�', 'Erling Skakkes gate 78�', 'Stavern�', 4110, 'Norway�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 71, 'Save-a-lot Markets�', 'Jose Pavarotti�', '187 Suffolk Ln.�', 'Boise�', 83720, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 72, 'Seven Seas Imports�', 'Hari Kumar�', '90 Wadhurst Rd.�', 'London�', 'OX15 4NB�', 'UK�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 73, 'Simons bistro�', 'Jytte Petersen�', 'Vinb�ltet 34�', 'K�benhavn�', 1734, 'Denmark�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 74, 'Sp�cialit�s du monde�', 'Dominique Perrier�', '25, rue Lauriston�', 'Paris�', 75016, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 75, 'Split Rail Beer & Ale�', 'Art Braunschweiger�', 'P.O. Box 555�', 'Lander�', 82520, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 76, 'Supr�mes d�lices�', 'Pascale Cartrain�', 'Boulevard Tirou, 255�', 'Charleroi�', 'B-6000�', 'Belgium�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 77, 'The Big Cheese�', 'Liz Nixon�', '89 Jefferson Way Suite 2�', 'Portland�', 97201, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 78, 'The Cracker Box�', 'Liu Wong�', '55 Grizzly Peak Rd.�', 'Butte�', 59801, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 79, 'Toms Spezialit�ten�', 'Karin Josephs�', 'Luisenstr. 48�', 'M�nster�', 44087, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 80, 'Tortuga Restaurante�', 'Miguel Angel Paolino�', 'Avda. Azteca 123�', 'M�xico D.F.�', 5033, 'Mexico�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 81, 'Tradi��o Hipermercados�', 'Anabela Domingues�', 'Av. In�s de Castro, 414�', 'S�o Paulo�', '05634-030�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 82, 'Trails Head Gourmet Provisioners�', 'Helvetius Nagy�', '722 DaVinci Blvd.�', 'Kirkland�', 98034, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 83, 'Vaffeljernet�', 'Palle Ibsen�', 'Smagsl�get 45�', '�rhus�', 8200, 'Denmark�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 84, 'Victuailles en stock�', 'Mary Saveley�', '2, rue du Commerce�', 'Lyon�', 69004, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 85, 'Vins et alcools Chevalier�', 'Paul Henriot�', '59 rue de lAbbaye�', 'Reims�', 51100, 'France�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 86, 'Die Wandernde Kuh�', 'Rita M�ller�', 'Adenauerallee 900�', 'Stuttgart�', 70563, 'Germany�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 87, 'Wartian Herkku�', 'Pirkko Koskitalo�', 'Torikatu 38�', 'Oulu�', 90110, 'Finland�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 88, 'Wellington Importadora�', 'Paula Parente�', 'Rua do Mercado, 12�', 'Resende�', '08737-363�', 'Brazil�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 89, 'White Clover Markets�', 'Karl Jablonski�', '305 - 14th Ave. S. Suite 3B�', 'Seattle�', 98128, 'USA�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 90, 'Wilman Kala�', 'Matti Karttunen�', 'Keskuskatu 45�', 'Helsinki�', 21240, 'Finland�' );
insert into customers ( CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country ) VALUES ( 91, 'Wolski�', 'Zbyszek�', 'ul. Filtrowa 68�', 'Walla�', '01-012�', 'Poland�' );
