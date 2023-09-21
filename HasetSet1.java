package CollectionDAY2;
import java.util.*;
public class HasetSet1 {
	public static void main(String args[]) {
		HashSet<Double> nms=new HashSet<Double>();
		nms.add(424234.3434);
		nms.add(1.1);
		nms.add(222.2);
		nms.add(22.2);
		nms.add(222.2);

		System.out.println(nms);
		
		
		TreeSet<Double> tree=new TreeSet<Double>();
		tree.addAll(nms);
		System.out.println(tree);
	}

}
