package designpatten.composite_14.test3;


//���������
public class Client {

	
	public static void main(String agrs[]){
		Component root = new Composite("��װ");
		Component c1 = new Composite("��װ");
		Component c2 = new Composite("Ůװ");
		
		Component leaf1 = new Leaf("����");
		Component leaf2 = new Leaf("�п�");
		Component leaf3 = new Leaf("ȹ��");
		
		//��ϳ����νṹ
		root.addChild(c1);
		root.addChild(c2);
		c1.addChild(leaf1);		
		c1.addChild(leaf2);
		c2.addChild(leaf3);
		
		
		Component o = root.getChild(1);
		System.out.println("\n��װ�ṹ��");
		root.printStruct("");
		System.out.println("ɾ����װ");
		root.removeChild(c1);
		root.printStruct("");
   }
}
