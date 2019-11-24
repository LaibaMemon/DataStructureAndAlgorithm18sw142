import java.util.*;
class Person
{
	 private String name;
	 private int age;
	 public Person()
	 {

	 }

	public Person(String name,int age)
	{
	    this.name=name;
	    this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		 this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class Student extends Person
{
        private int rollno;
        public Student()
        {

        }
        public Student(String name,int age,int rollno)
        {
        	super(name,age);
            this.rollno=rollno;
        }

        public void SetRollno(int rollno)
        {
        	this.rollno=rollno;
        }
        public int getRollno()
        {
        	return rollno;
        }
        public String toString()
        {
        	return ("Name =" + getName()+  " \nrollno = "+ getRollno() + " \nage= "+getAge());
        }
}
class TaSk1LinkedList
{
	public static void main(String args[])
	{
		LinkedList<Student> list=new LinkedList<Student>();

		list.add(new Student("laiba",18,142));       //1st operation
		list.add(new Student("Aiman",19,32));
		list.add(new Student("nitalia",18,34));
		list.add(new Student("sana",19,76));
		list.add(new Student("habiba",29,78));
		System.out.println(list.isEmpty());     //2nd Operation
		System.out.println(list.size());       //3rd Operation
		System.out.println(list.clone());     //4th Operation
		list.clear();
	}
}