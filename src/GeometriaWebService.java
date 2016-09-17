

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GeometriaWebService
 * 
 * 
 * @Autor 3a serie Sistemas de Informação UEG 2016
 * 
 * 
 * Classe que recebe e retora a requisição de
 * processamento para reconhecimento
 * de Formas geométricas
 * 
 */
public class GeometriaWebService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeometriaWebService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//Criar o vetor para receber as entradas (coordenadas)
		Entrada[] vectEntradas = null;


		//Transformar a requisição de Json para um vetor de entradas
		Gson g = new Gson();

		try{
			String json = request.getParameter("request");
			vectEntradas = g.fromJson(json,  Entrada[].class);
		}catch(com.google.gson.JsonSyntaxException e){
			e.printStackTrace();
		}
		
		//Executar tudo e gerar a resposta
		Saida saida = execute(vectEntradas);
		
		
		//
		String resposta = g.toJson(saida);
		response.setContentType("application/json");
		response.getWriter().println(resposta);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * Executa todo processo e gera um sáida caso conheça a forma Geométrica
	 * @param vectEntradas Vetor de Entradas
	 * @return [Saida = o Webservice conheça a forma | null = o Web Service não conheça a forma Geométrica]
	 */
	public Saida execute(Entrada[] vectEntradas){

		Saida saida = null;

		if(vectEntradas.length == 4){
			saida = new Saida();
			double area;

			int[] cord1 = vectEntradas[0].coord;
			int[] cord2 = vectEntradas[1].coord;
			int[] cord3 = vectEntradas[2].coord;
			int[] cord4 = vectEntradas[3].coord;

			int arestaX = cord2[1] - cord1[1];
			int arestaY = cord3[0] - cord2[0];

			if(arestaX == arestaY){


				area = arestaX * arestaY;


				saida.setArea(area);
				saida.setNome("Quadrado");
			}
		}


		/** 
		 * Aqui você coloca tudo que precisa para gerar a saída
		 */
		
		//Retornar sáida
		return saida;
	}

}
