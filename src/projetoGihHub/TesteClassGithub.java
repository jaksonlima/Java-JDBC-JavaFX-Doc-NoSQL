package projetoGihHub;

import projetoGihHub.Connetion.GitHubConnetion;

public class TesteClassGithub  extends GitHubConnetion{
	
	public static void main(String[] args) {
		
		GitHubConnetion gt = new GitHubConnetion();
		
		gt.setEmaiil("jaksonsneider@gmail.com");
		
		System.out.println(gt.getEmaiil());
		
	}

}
