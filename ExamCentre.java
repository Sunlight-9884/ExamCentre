package multiplechoicequiz;

import java.util.Scanner;

public class ExamCentre {
	//Sai Nay Lin Htun
//
	public static void main(String[] args) {
	
		String q1 = "Where does the sunrises?\n"				
				+ "(a)Nouth\n(b)Earth\n(c)south\n(d)nothing\n";
		
		String q2 = "What is the capital of Myanmar?\n"				
				+ "(a)Yangon\n(b)Naypyithaw\n(c)Mandalay\n";
		
		String q3 = "What is the capital of japan?\n"				
				+ "(a)Tokyo\n(b)Omiya\n(c)kawasaki\n(d)nothing\n";
		
		
		
		
		String q4 = "What is the capital of Thiland?\n"				
				+ "(a)Bangkok\n(b)prachuap\n(c)Chiang Mai\n(d)nothing\n";
		
		
		String q5 = "What is the capital of China ?\n"				
				+ "(a)Yunan\n(b)Shanghai\n(c)beijing\n(d)nothing\n";
		
		String q6 = "What is the capital of loa?\n"				
				+ "(a)Vientiance\n(b)Luang Prabang\n(c)Sam Nuea\n(d)nothing\n";
		
		String q7 = "What is the capital of Malaysia?\n"				
				+ "(a)Ipoh\n(b)kuala Lumpur\n(c)Johopr bahru\n(d)nothing\n";
		
		String q8 = "What is the capital of Nepal?\n"				
				+ "(a)Pokhara\n(b)Birgunj\n(c)Kathmandu\n(d)nothing\n";
		
		String q9 = "What is the capital of India?\n"				
				+ "(a)Tezpur\n(b)New Delhi\n(c)Rameswaram\n(d)nothing\n";
		
		String q10 = "What is the capital of South Korea?\n"				
				+ "(a)Souel\n(b)Busan\n(c)incheon\n(d)nothing\n";
		
		String q11 = "1 + 2 = \n"				
				+ "(a)2 \n(b)1 \n(c)3 \n(d)nothing\n";
		
		String q12 = "100+ 2=\n"				
				+ "(a)100\n(b)101\n(c)102\n(d)nothing\n";
		
		String q13 = "i++ =?  , i=1 \n"				
				+ "(a)2 \n(b)1 \n(c)3\n(d)nothing\n";
		
		
		String q14 = "2*2 = \n"				
				+ "(a)3\n(b)4\n(c)8\n(d)nothing\n";
		
		
		String q15 = "10/2\n"				
				+ "(a)10\n(b)5\n(c)8\n(d)nothing\n";
		
		
		String q16 = "What is your name?\n"				
				+ "(a)Mr.sai\n(b)Ko.sai\n(c)sunlight\n(d)nothing\n";
		
		String q17 = "x=1+3(2) , x =?\n"				
				+ "(a)8\n(b)7\n(c)9\n(d)nothing\n";
		
		
		String q18 = "x = 56 + 44 , x =?\n"				
				+ "(a)99 \n(b)88 \n(c)100 \n(d)nothing\n";
		
		
		String q19 = "x = 60 + 20\n"				
				+ "(a)80\n(b)70\n(c)90\n(d)nothing\n";
		
		String q20 = "What are you sir.name? \n"				
				+ "(a)hein ko ko \n(b)ko ko hein \n(c)ko hein\n(d)hein ko\n";
		
		
	
		Question [] questions = {
			    new Question (q1 , "b"),
				new Question (q2, "b"),
				new Question (q3, "a"),
				new Question (q4, "a"),
				new Question (q5, "c"),
				new Question (q6, "a"),
				new Question (q7, "b"),
				new Question (q8, "c"),
				new Question (q9, "b"),
				new Question (q10, "a")	,
				new Question (q11, "c"),
				new Question (q12, "c"),
				new Question (q13, "a"),
				new Question (q14, "b"),
				new Question (q15, "b"),
				new Question (q16, "d"),
				new Question (q17, "b"),
				new Question (q18, "c"),
				new Question (q19, "a"),
				new Question (q20, "a")
		
	};
		output(questions );
	
	}

	private static void output(Question[] questions) {
		int score = 0;
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0; i<questions.length; i++) {
				System.out.println(questions[i].prompt);
				String answer =sc.nextLine();
				if(answer.equals(questions[i].answer)) {
					score++;
						
				}
				
				}
		}
		System.out.println("You are score:" + score +"/"+ questions.length);
		System.out.println("Percentage :" + score*500/100+"%");
		
	if (score>=12) {
		System.out.println(" Passed");
	}else if(score <=12) {
		System.out.println("Failed");
			
		}
		
	}
		
	}





