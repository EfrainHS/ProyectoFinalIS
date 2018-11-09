package Servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import pojos.Cita;
import pojos.Doctor;
import pojos.Paciente;

public class Servicio {
    public void registrar(String urlWS, String parametros){
        try{
            URL url  = new URL(urlWS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.getOutputStream().write(parametros.getBytes("UTF-8"));
            if (conn.getResponseCode() != 200){
                throw new RuntimeException("Conexion fallida con codigo: "+conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String respuesta;
            while((respuesta = br.readLine()) != null){
                System.out.println(respuesta);
            }
            conn.disconnect();
        }catch(Exception e){
            System.err.println("Exception: "+e);
        }
    }
    
    public void actualizar(String urlWS, String parametros){
        try{
            URL url  = new URL(urlWS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.getOutputStream().write(parametros.getBytes("UTF-8"));
            if (conn.getResponseCode() != 200){
                throw new RuntimeException("Conexion fallida{ con codigo: "+conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String respuesta;
            while((respuesta = br.readLine()) != null){
                System.out.println(respuesta);
            }
            conn.disconnect();
        }catch(Exception e){
            System.err.println("Exception: "+e);
        }
    }
    
    public List<Paciente> consultarPacientes(String urlWS){
        ArrayList<Paciente> usuarios = null;
        try{
            URL url  = new URL(urlWS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200){
                throw new RuntimeException("Conexion fallida con codigo: "+conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String respuesta;
            String gsonRespuesta = "";
            while((respuesta = br.readLine()) != null){
                gsonRespuesta = respuesta;
            }
            conn.disconnect();
            
            //Implementacion para arreglos
            Gson gson = new Gson();
            TypeToken<List<Paciente>> tipoListaCat = new TypeToken<List<Paciente>>(){};
            usuarios = gson.fromJson(gsonRespuesta, tipoListaCat.getType());
            
        }catch(Exception e){
            System.err.println("Exception: "+e);
        }
        return usuarios;
    }
    
     public List<Cita> consultarCitas(String urlWS){
        ArrayList<Cita> usuarios = null;
        try{
            URL url  = new URL(urlWS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200){
                throw new RuntimeException("Conexion fallida con codigo: "+conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String respuesta;
            String gsonRespuesta = "";
            while((respuesta = br.readLine()) != null){
                gsonRespuesta = respuesta;
            }
            conn.disconnect();
            
            //Implementacion para arreglos
            Gson gson = new Gson();
            TypeToken<List<Cita>> tipoListaCat = new TypeToken<List<Cita>>(){};
            usuarios = gson.fromJson(gsonRespuesta, tipoListaCat.getType());
            
        }catch(Exception e){
            System.err.println("Exception: "+e);
        }
        return usuarios;
    }
    
    public List<Doctor> login(String urlWS){
        ArrayList<Doctor> doctores = null;
        try{
            URL url  = new URL(urlWS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200){
                throw new RuntimeException("Conexion fallida con codigo : "+conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String respuesta;
            String gsonRespuesta = "";
            while((respuesta = br.readLine()) != null){
                gsonRespuesta = respuesta;
            }
            conn.disconnect();
            
            //Implementacion para arreglos
            Gson gson = new Gson();
            TypeToken<List<Doctor>> tipoListaCat = new TypeToken<List<Doctor>>(){};
            doctores = gson.fromJson(gsonRespuesta, tipoListaCat.getType());
            
        }catch(Exception e){
            System.err.println("Exception: "+e);
        }
        return doctores;
    }
}
