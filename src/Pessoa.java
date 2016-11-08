public class Pessoa implements Observer {

	private String nome;
	private int cpf;
	private Subject subject;
	
	private String articleOfTheWeek;

	public Pessoa(String nome, int cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa(){
		this("Sem nome",0000);
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Subject getSubject(){
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
		subject.subscribe(this);
	}
	
	public void update(){
		Object obj = subject.getData();
		if(obj instanceof String){
			this.articleOfTheWeek = (String)obj;
		}
	}
	
	public boolean equals(Object ob){
		if(ob instanceof Pessoa){
			Pessoa pessoa = (Pessoa) ob;
			if(pessoa.getCpf() == this.cpf){
				return true;
			}
		}
		return false;
	}

	public String getArticleOfTheWeek() {
		return this.articleOfTheWeek;
	}

	public void setArticleOfTheWeek(String articleOfTheWeek) {
		this.articleOfTheWeek = articleOfTheWeek;
	}
	
	
}
