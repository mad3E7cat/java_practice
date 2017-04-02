public class PhraseGenerate
{
	public static void phrazeGeneratePrint()
	{
		String[] worldList1 = {"коротконогое","волосатое","лысое","жирное","анорексичное","неуклюжее","неказистое","носатое","ушастое","большеухое","глазастое","вонючее","тошнотворное","отвратительное"};
		String[] worldList2 = {"тупорылое","тупое","нелогичное","дебильное","идиотическое","аутичное","придурошное","кретиническое","невразумительное"};
		String[] worldList3 = {"жывотнае","бомжище","убожество","гавнище","баранище","псинище","смердище"};		
		int len1 = worldList1.length;
		int len2 = worldList2.length;
		int len3 = worldList3.length;
		int rand1 = (int)(Math.random() * len1);
		int rand2 = (int)(Math.random() * len2);	
		int rand3 = (int)(Math.random() * len3);
		String phraze = worldList1[rand1] + " " + worldList2[rand2] + " " + worldList3[rand3];
		System.out.println(phraze);
	} 
	public static void main(String[] args) 
	{
		System.out.println("Введите число > 0, чтобы продолжить, -1 чтобы выйти...");
		int x = 0;
		while(x != 100)
		{
			phrazeGeneratePrint();
			x++;
		}
	}
}