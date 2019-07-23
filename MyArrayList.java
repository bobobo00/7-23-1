package Array;


public class MyArrayList{
	private int[] a;
	private int size;
	
	public MyArrayList(){
		a=new int[2];
		size=0;
	}
	//扩容
	private void ensureCapity(){
		if(this.size<this.a.length){
			return;
		}
		else{
			int[] newarray=new int[this.a.length*2];
			for(int i=0;i<this.size;i++){
				newarray[i]=a[i];
			}
			a=newarray;
		}
	}
	//插入
	//插入指定位置
	public  void insert(int index,int v){
		for(int i=this.size;i>=index;i--){
			this.a[i]=this.a[i-1];
		}
		this.a[index]=v;
		this.size++;
	}
	//尾插法
	public void pushBack(int v){
		this.ensureCapity();
		this.a[this.size++]=v;	
	}
	//头插法
	public void pushFront(int v){
		for(int i=size;i<=1;i--){
			this.a[i]=this.a[i-1];
		}
		this.a[0]=v;
		this.size++;
	}
	//删除
	//删除指定位置
	public boolean popArray(int index){
		if(this.size<=0){
			System.err.println("顺序表为空");
			return false;
		}
		if(index<0||index>this.size-1){
			System.err.println("下标无效");
			return false;
		}
		for(int i=index;i<this.size-1;i++){
			this.a[i]=this.a[i+1];
		}
		this.a[--this.size]=0;
		return true;
	}
	//尾删法
	public boolean popBack(){
		if(this.size<=0){
			System.err.println("顺序表为空");
			return false;
		}
		this.a[--this.size]=0;
		return true;
	}
	//头删法
	public boolean popFront(){
		if(this.size<=0){
			System.err.println("顺序表为空");
			return false;
		}
		for(int i=0;i<this.size-1;i++){
			this.a[i]=this.a[i+1];
		}
		this.a[--this.size]=0;
		return true;
	}
	//修改指定位置数据
	public void alterArray(int index,int v){
		if(index<0||index>this.size-1){
			System.err.println("下标无效");
			return;
		}
		this.a[index]=v;
	}
	//查询指定位置数据
	public int searchArray(int index){
		if(index<0||index>this.size-1){
			System.err.println("下标无效");
			return -1;
		}
		return this.a[index];
	}
	//打印线性表
	public void printArrayList(){
		for(int i=0;i<this.size;i++){
			System.out.print(this.a[i]+" ");
		}
		System.out.print("当前容量："+this.a.length);
		System.out.println();
	}
	public static void main(String[] args){
		MyArrayList m=new MyArrayList();
		m.pushBack(1);
		m.pushBack(2);
		m.printArrayList();
		m.pushBack(1);
		m.pushBack(1);
		//m.pushFront(10);
		//m.insert(3,3);
		//m.PopArray(1);
		m.printArrayList();
		
	}
}