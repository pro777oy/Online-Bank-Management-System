public class Customer{

  public int customer_id;
  public String name;
  public int phone_no;

  
  public Customer(int id, String n, int phone){
    customer_id = id;
    name = n;
    phone_no = phone;
  
  }
  
  public int getID(){
    return customer_id;
}
  
  public void setID(int id){
    customer_id = id;
  }
  
  public int getName(){
    return name;
}
  
   public void setName(String name){
    this.name = name;
  }
   
    public int getPhone(){
    return phone_no;
}
    
 public void setID(int phone){
    phone_no = phone;
  }
}