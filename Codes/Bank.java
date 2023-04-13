public class Bank{
 public String name;
 public int code;
 
 private final List<Branch> branches;
 Bank(List<Branch> branches) { this.branches = branch; }
 
 
 public Bank(){}
 
 public Bank(String name, int code){
   this.name = name;
   this.code = code;
}
 
 public void addBranch(int code){
   branch_code = code;
 }
 
 public void removeBranch(){
   branch_code = 0;
 }
 
 public String getBranch(){
   return branch_code;
 }
}
 
 