package Q1;

public class MyGenericClass<T> {
	   private T data;
	   public MyGenericClass(T data) {
	      this.data = data;
	   }
	   public T getData() {
	      return data;
	   }
	}
