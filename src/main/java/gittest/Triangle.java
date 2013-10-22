package gittest;

public class Triangle {
	   protected long sideA = 0;
	   protected long sideB = 0;
	   protected long sideC = 0;
	   protected long[] sides = new long[3];
		
	   public Triangle(long sideA, long sideB, long sideC){
	       this.sideA = sideA;
	       this.sideB = sideB;
	       this.sideC = sideC;
	       this.sides[0] = sideA;
	       this.sides[1] = sideB;
	       this.sides[2] = sideC;
	       
	   }
	   
	   //Whether it is a triangle
	   public boolean isTriangle(){
		   sort();
		   if(sides[0] + sides[1] > sides[2]){
			   return true;
		   }else{
			   return false;
		   }
	   }
	   
	   //Different triangle types
	   public String type(){
		   if(isTriangle()){
			   long result = sides[0]*sides[0]+sides[1]*sides[1]-sides[2]*sides[2];
			   if(result == 0){
			       return "Right Triangle";	   
				   
			   }else if(result > 0){
			       return "Acute Triangle";
			   }else{
				   return "Obtuse Triangle"; 
			   }		   
		   }else{
			   return "Not A Triangle";
		   }	      
	   }
	   
	   //Bubble sort
	   public void sort(){
		   long temp;
		   
		   for(int i =0; i < 2; i++){
			   for(int j =0; j < 2-i; j++){
				   if(sides[j] > sides[j+1])
				   {
					   temp = sides[j];
					   sides[j] = sides[j+1];
					   sides[j+1] = temp;				   
				   }			   
			   }		   
		   }
	   }
	   
	   
	}
