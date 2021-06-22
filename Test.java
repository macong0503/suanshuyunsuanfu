package com.fs.test;

public class Test {
	
	//算术运算符
	public void aMethod(int a,int b){
		int add=a+b;
		int reduce=a-b;
		int multiply=a*b;
		int divide=a/b;//a对b整除的数
		int residue=a%b;//a对b整除之后得到的余数
		
		System.out.println("add="+add);
		System.out.println("reduce="+reduce);
		System.out.println("multiply="+multiply);
		System.out.println("divide="+divide);
		System.out.println("residue="+residue);
		
		
		//表示正负符号
		int m = -10;
		int n = +10;
	}

	/**自增自减
	 * i++:先用i变量的值，然后在进行加法运算;先用后加
	 * ++i：先加1再使用i变量的值；现加后用
	 * i--：先用后减
	 * --i：先减后用
	 */
	public void bMethod(){
		
		int i = 5;
		i++;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println("---------------");
		int j = 5;
		j = j+1;
		System.out.println(j--);
		System.out.println(--j);
		System.out.println(j);
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.aMethod(10,3);
		t.bMethod();
		

	}

}
