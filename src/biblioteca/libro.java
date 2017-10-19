package biblioteca;

public abstract class libro {
	private String titulo;
	private String autor;
	private String genero;
	private String editorial;
	private String sinopsis;
	
	public libro (String titulo, String autor, String genero, String editorial, String sinopsis) {
		titulo = titulo;
		autor = autor;
		genero = genero;
		editorial = editorial;
		sinopsis = sinopsis;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
}
