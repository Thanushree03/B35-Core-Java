package org.tnsindia.lambdaexpdemo;
//driver class
public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		/*implementing the functional interface-Employee using 
		lambda Expression
        Employee obj=()->{
        	System.out.println("Lambda expression-No parameter");
        };
        obj.display();*/
        
        /*implementing the functional interface-Employee using 
		lambda Expression
        Employee obj=(int a,int b)->{
        	
        	int result=(a>b)?a:b;
        	System.out.println("The maximum number is: "+result);
        	return result;
        };
        obj.max(32,68);*/
		Employee obj=(a,b)->(a>b)?a:b;
		System.out.println("The maximum number is: "+obj.max(32, 68));
        }
	}


