# iv
It´s a homework Java exercise.
It´s a simple project to control money inputs/outputs and the total balance of the account.
At the beginning the user must create an account introducing his name, age and ID number(which is checked for the correct format). 
After that account is created and the user can add inputs/outputs(description and amount) to the account, 
which are saved in the respective arraylist for further querys.
Besides main class the project has 6 more classes. 
Classes “Gasto”(output) and “Ingreso”(input) extend to an abstract class “Dinero”(money). 
The class “Usuario” (User) creates a user and checks the ID number format. 
The class “Cuenta”(Account) controls  inputs and outputs and also it throws an exception in case the output is greater the account balance.
