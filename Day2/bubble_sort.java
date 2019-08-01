public class bubble_sort {
	public static void sort(String word)
	{
		int pos=0,com=0;
		byte temp;
		byte[] letter=word.getBytes();//converting into bytes using the getBytes() method
		while(pos<letter.length-1)
		{
			com=0;
			while(com<letter.length-pos-1)
			{
				if(letter[com]>letter[com+1])
				{
					
					temp=letter[com];
					letter[com]=letter[com+1];
					letter[com+1]=temp;
					
				}
				com++;
			}
			pos++;
		}
		System.out.println(new String(letter));
	}
	public static void main(String[] args) {
		
		String s="DataScience";
	
		 bubble_sort.sort(s);
 
	}

}