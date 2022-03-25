package javaMutationProject;

public class MySourceCode {

    private int count;

    public void reset() {
      count = 0;
    }

    public int currentCount() {
      return count;
    }
    
	public void count(int i) {
		if (i >= 10) {
	          count++;
	      }
	}
    
}
