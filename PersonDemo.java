/*class Person{
	int sid;
	string sname;
	string qual;
	void personaldetails(int sid, String sname){
		this.sid=sid;
		this.sname=sname;
		}
	void qualification(String qual){
		this.qual=qual;
		}
	void display(){
		System.out.println("person name" + sname);
		System.out.println("person id"+ sid);
		System.out.println("qualification" + qual);
		
}
class PersonDemo{
	public static void main(String[] args){
		Person p = new Person();
		p.personaldetails("shanmukh",117);
		p.qualification("B.tech");
		p.display();
}
}
class PersonConstructor {
    int sid;
    String sname;
    String qual;
              
    PersonConstructor(int id,String name,String qul)
    {
    	sid=id;
	sname=name;
	qual=qul;
    }
    String display() {
        return sid + " " + sname + " " + qual;
    }
}

class PersonDemo {
    public static void main(String[] args) {
        PersonConstructor p = new PersonConstructor(117,"shanmukh","B.Tech");
        System.out.println("Personal Details: " + p.display());
    }
}class PersonConstructorOverloading {
    int sid;
    String sname;
    String qual;

    PersonConstructorOverloading()
    {
	this.sid = 0;
	this.sname = "Noname";
	this.qual = "None";
    }
              
    PersonConstructorOverloading(int id,String name,String qul)
    {
    	this.sid=id;
	this.sname=name;
	this.qual=qul;
    }
   void display()
   {
	System.out.println(+sid+ " " +sname+ "  " +qual);	
   }
  
}

class PersonDemo {
    public static void main(String[] args) {
        PersonConstructorOverloading p1 = new PersonConstructorOverloading();
	PersonConstructorOverloading p2 = new PersonConstructorOverloading(117,"shanmukh","B.Tech");
	p1.display();	
        p2.display();
	}
}*/
/*class Person {
    int sid;
    String sname;
    String qual;

    // Method 1: Overloaded personaldetails with only sid
    void personaldetails(int sid) {
        this.sid = sid;
        this.sname = "Unknown"; // default name
    }

    // Method 2: Overloaded personaldetails with only sname
    void personaldetails(String sname) {
        this.sname = sname;
        this.sid = -1; // default id
    }
    
    // Method 3: personaldetails with (int, String)
    void personaldetails(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    void qualification(String qual) {
        this.qual = qual;
    }

    void display() {
        System.out.println("Person name: " + sname);
        System.out.println("Person id: " + sid);
        System.out.println("Qualification: " + qual);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        

        System.out.println("-------------------");

        Person p2 = new Person();
        p2.personaldetails(117); // using (int)
        p2.qualification("M.Tech");
        p2.display();

        System.out.println("-------------------");

        Person p3 = new Person();
        p3.personaldetails("shanmukh"); // using (String)
        p3.qualification("MBA");
        p3.display();
        
        Person p1 = new Person();
        p1.personaldetails(117, "Shanmukh"); // using (int, String)
        p1.qualification("B.Tech");
        p1.display();
    }
}*/
class Person {
    int sid;
    String sname;
    String qual;
    int num;
    static int count;
  
    Person(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    Person(int sid, String sname, String qual,int num) {
        this.sid = sid;
        this.sname = sname;
        this.qual = qual;
        this.num = num;
    }
    
    String display() {
        return "SID:"+ sid + " " + "SNAME:"+ sname + " " + "QUAL:"+ qual + " "+ "NUM:"+ num;
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person(117, "shannmukh", "BTech",1);
        Person p1 = new Person(118, "shannu", "BTech",2);
        Person p2 = new Person(119, "shan", "BTech",3);

      /* Person[] pobj = {p,p1,p2};
for(Person per: pobj)
{
    System.out.println("Personal Details: "+ p.display());
}*/

       System.out.println("Personal Details: "+ p.display());
        System.out.println("Personal Details: " + p1.display());
        System.out.println("Personal Details: " + p2.display());

    }
}