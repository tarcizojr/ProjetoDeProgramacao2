package projeto;

import java.util.*;

public class CentralDeInformacoes {  
    ArrayList<Funcao> listaDePares = new ArrayList<Funcao>();    
    ArrayList <Colaborador> todosOsColaboradores = new ArrayList <Colaborador> ();
    ArrayList <Servico> listaDeServico = new ArrayList <Servico> ();

    public ArrayList<Colaborador> getTodosOsColaboradores() {
        return todosOsColaboradores;
    }


    public void setTodosOsColaboradores(ArrayList<Colaborador> todosOsColaboradores) {
        this.todosOsColaboradores = todosOsColaboradores;
    }

    public ArrayList<Servico> getTodosOsServicos() {
        return listaDeServico;
    }


    public void setTodosOsServicos(ArrayList<Servico> listaDeServico) {
        this.listaDeServico = listaDeServico;
    }
    
    public ArrayList<Funcao> getListaDePares() {
        return listaDePares;
    }

    public void setListaDePares(ArrayList<Funcao> listaDePares) {
        this.listaDePares = listaDePares;
    }

//-----------------------------------------------------------------
    public boolean adicionarColaborador(Colaborador c) {
        if (recuperarColaborador(c.getEmail()) != null) {
              return false;
        }

        todosOsColaboradores.add(c);
        return true;
    }
    public String recuperarColaborador (String email) {
        for (Colaborador x :todosOsColaboradores ) {
            if (x.getEmail().equals(email)){

                return email;
            }
        }
        return null;
    }

    public boolean adicionarServico (Servico s) {
            if (recuperarServico(s.getId()) != 0 ) {
               return false;
          }

        listaDeServico.add(s);
        return true;
    }
    public long recuperarServico (long id) {
        for (Servico x : listaDeServico) {
            if (x.getId() == id) {
                return id;
            }
        }
        return id = 0;
    }
   public boolean associar(String email, long id) {
       String c = recuperarColaborador(email);
       long i = recuperarServico(id);
       if (c.equals(email) && i == id) {
           return true;
       }
       return false;
}
}