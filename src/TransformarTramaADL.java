
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class TransformarTramaADL {
	
	static List<oe_consultarXML> listaConsultas = new ArrayList<oe_consultarXML>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String tramaADL = generarXML();
		tramaADL = transformarXML(tramaADL);
		construirXML(tramaADL);	
		leerXML(listaConsultas);
		conversionJSON(listaConsultas);
	}
	
	public static String generarXML() {
		
		String xml = "&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;\r\n" + 
				"&lt;informe version=&quot;1.1&quot; fechaConsulta=&quot;1181336927152&quot; respuesta=&quot;13&quot;&gt;\r\n" + 
				"&lt;naturalNacional nombres=&quot;BLANCA DILIA&quot; primerApellido=&quot;ARANGO&quot; segundoApellido=&quot;JIMENEZ&quot; genero=&quot;3&quot;&gt;\r\n" + 
				"&lt;identificacion estado=&quot;00&quot; fechaExpedicion=&quot;628405200000&quot; ciudad=&quot;MEDELLIN&quot; departamento=&quot;ANTIOQUIA&quot; numero=&quot;00043559680&quot; /&gt;\r\n" + 
				"&lt;edad min=&quot;36&quot; max=&quot;45&quot; /&gt;\r\n" + 
				"&lt;llave&gt;100043559680&lt;/llave&gt;\r\n" + 
				"&lt;/naturalNacional&gt;\r\n" + 
				"&lt;cuentaCartera\r\n" + 
				"estado=&quot;45&quot;\r\n" + 
				"periodicidad=&quot;M&quot;\r\n" + 
				"entidad=&quot;YANBAL DE COLOMBIA S.A.&quot;\r\n" + 
				"ultimaActualizacion=&quot;1143867600000&quot;\r\n" + 
				"numeroObligacion=&quot;550769500&quot;\r\n" + 
				"fechaApertura=&quot;1086066000000&quot;\r\n" + 
				"fechaVencimiento=&quot;1133413200000&quot;\r\n" + 
				"bloqueada=&quot;false&quot;\r\n" + 
				"tipoObligacion=&quot;1&quot;\r\n" + 
				"tipoCuenta=&quot;LAB&quot;\r\n" + 
				"garante=&quot;00&quot;\r\n" + 
				"comportamiento=&quot;CCCCCC6666665432-NNNN&quot;\r\n" + 
				"formaPago=&quot;0&quot;\r\n" + 
				"codSuscriptor=&quot;390003&quot;&gt;\r\n" + 
				"&lt;valores valorInicial=&quot;0&quot; saldoActual=&quot;0&quot; saldoMora=&quot;0&quot; cuota=&quot;0&quot; cuotasCanceladas=&quot;0&quot; totalCuotas=&quot;0&quot; /&gt;\r\n" + 
				"&lt;adjetivo codigo=&quot;43&quot; fecha=&quot;1107234000000&quot; /&gt;\r\n" + 
				"&lt;llave&gt;10004355968039000339550769500000000000&lt;/llave&gt;\r\n" + 
				"&lt;/cuentaCartera&gt;\r\n" + 
				"&lt;/informe&gt;";	
		
		return xml;
		
	}
	
	public static String transformarXML(String xml) {
		
		xml = xml.replaceAll("&quot;","\"");
		xml = xml.replaceAll("&lt;","<");
		xml = xml.replaceAll("&gt;",">");
		
		return xml;
	}
	
	public static void construirXML(String xml) throws IOException {
		
		File archivo = new File("tramaADL.xml");
		BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(xml);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(xml);
        }
        bw.close();
	}
	
	public static void leerXML(List<oe_consultarXML> listaConsultas) {
		
		
		String respuesta = null,version = null,fechaConsulta = null,nombres = null,primerApellido = null,segundoApellido = null,genero = null,estadoNaturalNacional = null,fechaExpedicion = null,ciudad = null,departamento = null,numero = null,min = null,max = null,llaveNaturalNacional = null;

		String estadoCuentaCartera = null,periodicidad = null,entidad = null,ultimaActualizacion = null,numeroObligacion = null,fechaApertura = null,fechaVencimiento = null,bloqueada = null,tipoObligacion = null,tipoCuenta = null,garante = null,comportamiento = null,formaPago = null,codSuscriptor = null,valorInicial = null,saldoActual = null,saldoMora = null,cuota = null,cuotasCanceladas = null,totalCuotas = null,codigo = null,fecha = null,llaveCuentaCartera = null;
        
        try {
        	
            File archivo = new File("tramaADL.xml");
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            
            NodeList listaNodo = document.getElementsByTagName("informe");

            
            // Se hace el recorrido para los nodos raiz del tag (informe) del XML
            for(int i = 0 ; i < listaNodo.getLength() ; i++) {
            	
            	Node nodoRaiz = listaNodo.item(i);
            	
            	if(nodoRaiz.getNodeType() == Node.ELEMENT_NODE) {
            		
            		Element element = (Element) nodoRaiz;
            		
            		version = element.getAttribute("version");
            		fechaConsulta = element.getAttribute("fechaConsulta");
            		respuesta = element.getAttribute("respuesta");
            		
            		NodeList listaNodoPadre = element.getElementsByTagName("naturalNacional");
            		// Se hace el recorrido para los nodos del tag (naturalNacional) del XML
            		for(int j = 0 ; j < listaNodoPadre.getLength() ; j++) {
            			Node nodoPadre = listaNodoPadre.item(j);
            			if(nodoPadre.getNodeType() == Node.ELEMENT_NODE) {
            				Element elementPadre = (Element) nodoPadre;
            				nombres = elementPadre.getAttribute("nombres");
            				primerApellido = elementPadre.getAttribute("primerApellido");
            				segundoApellido = elementPadre.getAttribute("segundoApellido");
            				genero = elementPadre.getAttribute("genero");	
            				
            				//extraer atributos del Tag identificacion
            				NodeList listaNodoHijo = document.getElementsByTagName("identificacion");
            				Node nodoHijo = listaNodoHijo.item(0);
            				Element elementHijo = (Element) nodoHijo;
            				estadoNaturalNacional = elementHijo.getAttribute("estado");
            				fechaExpedicion = elementHijo.getAttribute("fechaExpedicion");
            				ciudad = elementHijo.getAttribute("ciudad");
            				departamento = elementHijo.getAttribute("departamento");
            				numero = elementHijo.getAttribute("numero");
            				
            				//extraer atributos del Tag edad
            				listaNodoHijo = document.getElementsByTagName("edad");
            				nodoHijo = listaNodoHijo.item(0);
            				elementHijo = (Element) nodoHijo;
            				min = elementHijo.getAttribute("min");
            				max = elementHijo.getAttribute("max");

            				
            				llaveNaturalNacional = elementPadre.getElementsByTagName("llave").item(0).getTextContent();
            			}
            			
            		}
            		
            		listaNodoPadre = element.getElementsByTagName("cuentaCartera");
            		// Se hace el recorrido para los nodos del tag (cuentaCartera) del XML
            		for(int j = 0 ; j < listaNodoPadre.getLength() ; j++) {
            			Node nodoPadre = listaNodoPadre.item(j);
            			if(nodoPadre.getNodeType() == Node.ELEMENT_NODE) {
            				Element elementPadre = (Element) nodoPadre;
            				estadoCuentaCartera = elementPadre.getAttribute("estado");
            				periodicidad = elementPadre.getAttribute("periodicidad");
            				entidad = elementPadre.getAttribute("entidad");
            				ultimaActualizacion = elementPadre.getAttribute("ultimaActualizacion");
            				numeroObligacion = elementPadre.getAttribute("numeroObligacion");
            				fechaApertura = elementPadre.getAttribute("fechaApertura");
            				fechaVencimiento = elementPadre.getAttribute("fechaVencimiento");
            				bloqueada = elementPadre.getAttribute("bloqueada");
            				tipoObligacion = elementPadre.getAttribute("tipoObligacion");
            				tipoCuenta = elementPadre.getAttribute("tipoCuenta");
            				garante = elementPadre.getAttribute("garante");
            				comportamiento = elementPadre.getAttribute("comportamiento");
            				formaPago = elementPadre.getAttribute("formaPago");
            				codSuscriptor = elementPadre.getAttribute("codSuscriptor");	
            				
            				//extraer atributos del Tag valores
            				NodeList listaNodoHijo = document.getElementsByTagName("valores");
            				Node nodoHijo = listaNodoHijo.item(0);
            				Element elementHijo = (Element) nodoHijo;
            				valorInicial = elementHijo.getAttribute("valorInicial");
            				saldoActual = elementHijo.getAttribute("saldoActual");
            				saldoMora = elementHijo.getAttribute("saldoMora");
            				cuota = elementHijo.getAttribute("cuota");
            				cuotasCanceladas = elementHijo.getAttribute("cuotasCanceladas");
            				totalCuotas = elementHijo.getAttribute("totalCuotas");
            				
            				//extraer atributos del Tag adjetivo
            				listaNodoHijo = document.getElementsByTagName("adjetivo");
            				nodoHijo = listaNodoHijo.item(0);
            				elementHijo = (Element) nodoHijo;
            				codigo = elementHijo.getAttribute("codigo");
            				fecha = elementHijo.getAttribute("fecha");

            				
            				llaveCuentaCartera = elementPadre.getElementsByTagName("llave").item(0).getTextContent();
            			}
            			
            		}
            		
            		
            		
            		
            	}
            	
            }
            
            listaConsultas.add(
                    new oe_consultarXML(respuesta, 
 			               				version, 
 			               				fechaConsulta, 
 			               				nombres,
 			               				primerApellido,
 			               				segundoApellido,
 			               				genero,
 			               				estadoNaturalNacional,
 			               				fechaExpedicion,
 			               				ciudad,
 			               				departamento,
 			               				numero,
 			               				min,
 			               				max,
 			               				llaveNaturalNacional,
 			               				estadoCuentaCartera,
 			               				periodicidad,
 			               				entidad,
 			               				ultimaActualizacion,
 			               				numeroObligacion,
 			               				fechaApertura,
 			               				fechaVencimiento,
 			               				bloqueada, 
 			               				tipoObligacion, 
 			               				tipoCuenta, 
 			               				garante,
 			               				comportamiento,
 			               				formaPago, 
 			               				codSuscriptor, 
 			               				valorInicial, 
 			               				saldoActual, 
 			               				saldoMora,
 			               				cuota,
 			               				cuotasCanceladas, 
 			               				totalCuotas, 
 			               				codigo, 
 			               				fecha,
 			               				llaveCuentaCartera)
            );
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}
	
	
	  @SuppressWarnings("unchecked")
	public static void conversionJSON(List<oe_consultarXML> listaConsultas) {
	        
	        JSONObject nodo = new JSONObject();
	        JSONArray array = new JSONArray();
	        for(int i = 0 ; i < listaConsultas.size() ; i++) {
	            JSONObject nodoRaiz = new JSONObject();
	            nodoRaiz.put("version", listaConsultas.get(i).getVersion());
	            nodoRaiz.put("fechaConsulta", listaConsultas.get(i).getFechaConsulta());
	            nodoRaiz.put("respuesta", listaConsultas.get(i).getRespuesta());

	            
	            JSONObject nodoPadre = new JSONObject();
	            nodoPadre.put("nombres", listaConsultas.get(i).getNombres());
	            nodoPadre.put("primerApellido", listaConsultas.get(i).getPrimerApellido());
	            nodoPadre.put("segundoApellido", listaConsultas.get(i).getSegundoApellido());
	            nodoPadre.put("genero", listaConsultas.get(i).getGenero());
	            nodoPadre.put("llave", listaConsultas.get(i).getLlaveNaturalNacional());
	            
	            JSONObject nodoHijo = new JSONObject();
	            
	            nodoHijo.put("estado", listaConsultas.get(i).getEstadoNaturalNacional());
	            nodoHijo.put("fechaExpedicion", listaConsultas.get(i).getFechaExpedicion());
	            nodoHijo.put("ciudad", listaConsultas.get(i).getCiudad());
	            nodoHijo.put("departamento", listaConsultas.get(i).getDepartamento());
	            nodoHijo.put("numero", listaConsultas.get(i).getNumero());
	            
	            nodoPadre.put("identificacion", nodoHijo);
	            
	            nodoHijo = new JSONObject();
	            
	            nodoHijo.put("min", listaConsultas.get(i).getMin());
	            nodoHijo.put("max", listaConsultas.get(i).getMax());
	            
	            nodoPadre.put("edad", nodoHijo);
	            
	            nodoRaiz.put("naturalNacional", nodoPadre);
	            
	            nodoPadre = new JSONObject();
	            
	            nodoPadre.put("estado", listaConsultas.get(i).getEstadoCuentaCartera());
	            nodoPadre.put("periodicidad", listaConsultas.get(i).getPeriodicidad());
	            nodoPadre.put("entidad", listaConsultas.get(i).getEntidad());
	            nodoPadre.put("ultimaActualizacion", listaConsultas.get(i).getUltimaActualizacion());
	            nodoPadre.put("numeroObligacion", listaConsultas.get(i).getNumeroObligacion());
	            nodoPadre.put("fechaApertura", listaConsultas.get(i).getFechaApertura());
	            nodoPadre.put("fechaVencimiento", listaConsultas.get(i).getFechaVencimiento());
	            nodoPadre.put("bloqueada", listaConsultas.get(i).getBloqueada());
	            nodoPadre.put("tipoObligacion", listaConsultas.get(i).getTipoObligacion());
	            nodoPadre.put("tipoCuenta", listaConsultas.get(i).getTipoCuenta());
	            nodoPadre.put("garante", listaConsultas.get(i).getGarante());
	            nodoPadre.put("comportamiento", listaConsultas.get(i).getComportamiento());
	            nodoPadre.put("formaPago", listaConsultas.get(i).getFormaPago());
	            nodoPadre.put("codSuscriptor", listaConsultas.get(i).getCodSuscriptor());
	            
	            nodoHijo = new JSONObject();
	            
	            nodoHijo.put("valorInicial", listaConsultas.get(i).getValorInicial());
	            nodoHijo.put("saldoActual", listaConsultas.get(i).getSaldoActual());
	            nodoHijo.put("saldoMora", listaConsultas.get(i).getSaldoMora());
	            nodoHijo.put("cuota", listaConsultas.get(i).getCuota());
	            nodoHijo.put("cuotasCanceladas", listaConsultas.get(i).getCuotasCanceladas());
	            nodoHijo.put("totalCuotas", listaConsultas.get(i).getTotalCuotas());
	            
	            nodoPadre.put("valores", nodoHijo);
	            
	            nodoHijo = new JSONObject();
	            
	            nodoHijo.put("codigo", listaConsultas.get(i).getCodigo());
	            nodoHijo.put("fecha", listaConsultas.get(i).getFecha());
	            
	            nodoPadre.put("adjetivo", nodoHijo);
	            
	            nodoRaiz.put("cuentaCartera", nodoPadre);
	            array.add(nodoRaiz);
	        }
	        
	        nodo.put("informe", array);
	        
	        System.out.println(nodo);
	    }

}
