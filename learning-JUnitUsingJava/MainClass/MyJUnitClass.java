package MainClass;

public class MyJUnitClass {
  public int add(int a, int b){
	  return a+b;
  }
  public String ConCat(String a, String b){
	  return a+b;
	  
  }
  public int Multiply(int a,int b){
	  return a*b;
  }
  public int countA(String word){
	  int count=0;
	  for (int i=0;i<word.length();i++){
		  if(word.charAt(i)=='a'||word.charAt(i)=='A'){
			  count++;
		  }
	  }
	return count;	  
  }
}
