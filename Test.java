package com.fs.test;

public class Test {
	
	//���������
	public void aMethod(int a,int b){
		int add=a+b;
		int reduce=a-b;
		int multiply=a*b;
		int divide=a/b;//a��b��������
		int residue=a%b;//a��b����֮��õ�������
		
		System.out.println("add="+add);
		System.out.println("reduce="+reduce);
		System.out.println("multiply="+multiply);
		System.out.println("divide="+divide);
		System.out.println("residue="+residue);
		
		
		//��ʾ��������
		int m = -10;
		int n = +10;
	}

	/**�����Լ�
	 * i++:����i������ֵ��Ȼ���ڽ��мӷ�����;���ú��
	 * ++i���ȼ�1��ʹ��i������ֵ���ּӺ���
	 * i--�����ú��
	 * --i���ȼ�����
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
