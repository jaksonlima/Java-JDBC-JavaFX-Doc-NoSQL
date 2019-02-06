package projetoGihHub;

import projetoGihHub.Connetion.GitHubConnetion;

public class TesteClassGithub  extends GitHubConnetion{
	
	public static void main(String[] args) {
		
		GitHubConnetion gt = new GitHubConnetion();
		
		gt.setEmaiil("jaksonsneider@gmail.com");
		gt.setIduser(99870206);
		
		System.out.println(gt.getEmaiil());
		System.out.println(gt.longValue());
		
	}

}
