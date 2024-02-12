
//Bireysel Müşteri classı

// IndividualCustomer, Customer'ın genişletilmiş hali artık extends Customer sayesinde
// Customerdan id ve customerNumberı da çekebiliriz
public class IndividualCustomer extends Customer{


    // id ve customerNumber hem Bireysel Müşteride var hem de Kurumsal Müşteride var bundan dolayı ikisini temel yani base
    //müşteri olan Customer classının altına yazarız ve böylelikle Inheritance yani miras etmiş oluruz.
    //  int id;
    //  String customerNumber;
     String firstName;
     String lastName;
    String nationalIdentity; //tc
}
