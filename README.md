# Employee_Address_Mapping
>## Framework Used 
 * SpringBoot
>## Database Used 
 * Swagger
 * mysql workbench
>## Language Used
* Java
>## For Querying use these
* Crud Repository
* Custom Finder
* Custom Query
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
>## Data Structure used in my project
*we created two entity classes, Employee and Address, with the following attributes:

* **Employee:**
*id (Long)
*first name (String)
*lastName (String)
*address (Address)

* **Address:**
id (Long)
street (String)
City (String)
state (String)
Zipcode (String) 
>## project summery

*In the Employee entity class, add a @OneToOne annotation to the address attribute, to create a one-to-one mapping between Employee and Address and we create two controller classes, EmployeeController and AddressController, with the following methods to handle CRUD operations:

**EmployeeController:**
GET /employees - get all employees
GET /employees/{id} - get an employee by id
POST /employees - create a new employee
PUT /employees/{id} - update an employee by id
DELETE /employees/{id} - delete an employee by id

**AddressController:**
GET /addresses - get all addresses
GET /addresses/{id} - get an address by id
POST /addresses - create a new address
PUT /addresses/{id} - update an address by id
DELETE /addresses/{id} - delete an address by id
