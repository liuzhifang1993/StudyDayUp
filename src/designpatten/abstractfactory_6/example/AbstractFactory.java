package designpatten.abstractfactory_6.example;

public interface AbstractFactory {
	
	//����cpu
   public CPUApi createCPUApi();
   
   
   //��������
   public MainboardApi createMainBoardApi();
}
