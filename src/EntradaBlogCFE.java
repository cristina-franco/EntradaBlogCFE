/**
 * Clase para manejar las entradas de un blog.
 * @author Cristina Franco
 * @since 15/03/2021
 * @version 2.3
 */

public class EntradaBlogCFE {
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
        /**
         * Constructor de la case.
         * @param id , numero de entrada
         * @param autor, nombre de autor de la entrada
         * @param texto
         * @throws IllegalArgumentException 
         */
	public EntradaBlogCFE(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser "
                        + "negativo"); //Si el número de entrada es negativo, lanza una excepción.
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
        
        /**
         * Método que te proporciona la forma en la que te va a devolver el resultado
         * @return cad
         * @version 2.3
         */
        @Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
        /**
         * Método que devulve el número de la entrada
         * @return id, número entrada
         * @version 2.3
         */
	public int getId(){
		return this.id;
	}
	
	/**
         * Método que devuelve el texto completo de la entrada
         * return texto
         * @version 2.3
         */
	public String getTexto(){
		return this.texto;
	}
	
        /**
         * Método que devuelve el nombre del autor de la entrada en mayúsculas
         * @return autor, nombre del autor en mayuscula
         * @version 2.3
         */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
        /**
         * Método que devuelve el nombre del autor. En deuso
         * @deprecated
         * @return autor
         * @version 2.3
         */
	public String devuelveAutor(){
		return this.autor;
	}
	
	public static void main(String[] args) {
                
		EntradaBlogCFE e1=new EntradaBlogCFE (-3,"Cristina_Franco","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
