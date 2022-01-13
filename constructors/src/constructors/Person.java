package constructors;
public class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name; 
}  
void display(){
	System.out.println("display() of person class is called");
System.out.println(id+" "+name);


}
}  
