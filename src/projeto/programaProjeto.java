package projeto;

public class programaProjeto {
    public static void main(String[] args) {
      /*  Scanner leitor = new Scanner (System .in);
        
        Persistencia p = new Persistencia();
        
        Colaborador pessoa = null;
        centralDeInformaçoes rh = p.recuperarCentral(); 
     //   Mensageiro mensageiro = new Mensageiro();
        Servico servico = null;
        Funcao fu = new Funcao();
      
       // Verificar o Buscar Colaborador e Buscar Serviço 
           
       boolean acabou = false;
       do {
    	   System.out.println("1-Novo Colaborador"
                   + "\n2- Listar Todos os Colaboradores"
                   + "\n3- Buscar Colaborador"
                   + "\n4- Novo Serviço"
                   + "\n5- Listar Serviços"
                   + "\n6- Buscar Serviço"
                   + "\n7- Adicionar Colaborador a Serviço"
                   + "\n8- Enviar e-mail"
                   + "\nS-Sair");
    	  	
        switch(leitor.nextLine()) {
        case"1":
            System.out.println("---------Adicionar Novo Colaborador---------");
            System.out.println("Qual nome do Colaborador:");
            String nome = leitor.nextLine().toUpperCase();
            System.out.println("Qual o email do Colaborador:");
            String email = leitor.nextLine();
            System.out.println("Qual telefone do Colaborador");
            String tel = leitor.nextLine();
            System.out.println("Qual o sexo do Colaborador H/M");
            String s = leitor.nextLine().toUpperCase();
            Sexo sexo = null;
            if(s.equals("H")) {
                sexo = (Sexo.HOMEM);
            }else if(s.equals("M")){
                sexo = (Sexo.MULHER);
            }else {
                System.out.println("Sexo Invalido");
            }
            System.out.println("Pessoa Adicionada");
            
            pessoa = new Colaborador(nome, tel, sexo, email);
            
            rh.adicionarColaborador(pessoa);
            p.salvarCentral(rh);
            break;
        case"2":
            System.out.println("------Listar Todos Os Colaboradores--------");

            for(Colaborador a: rh.todosOsColaboradores) {
                System.out.println(a);
            }
        
        break;
        case "3":
            System.out.println("-----------Buscar Colaborador------");
        
            System.out.println("Digite o E-mail do Colaborador: ");
            Colaborador c = new Colaborador ();
            c.setEmail(leitor.nextLine());
            rh.recuperarColaborador(c.getEmail());
         
            System.out.println(rh.recuperarColaborador(c.getEmail()));

            
        break;
        
        case"4":
        	System.out.println("------Adicionar Novo Serviço----");
        	System.out.println("Qual nome do Serviço:");
        	String nomeS = leitor.nextLine();
        	System.out.println("Descrição:");
        	String des = leitor.nextLine();
        	System.out.println("Duração");
        	int d = Integer.parseInt(leitor.nextLine());
        	
        	servico = new Servico(nomeS, des, d);
        	
        	rh.adicionarServico(servico);
        
        	break;
        case"5":
            System.out.println("------Listar Todos Os Serviços--------");

            for(Servico a: rh.getTodosOsServicos()) {
                System.out.println(a);
            }
            break;
            
        case"6":
            System.out.println("---------Buscar Serviço------");
            System.out.println("Digite o Id do Serviço: ");
            Servico s1 = new Servico ();
            s1.setId(Long.parseLong(leitor.nextLine()));
            rh.recuperarServico(s1.getId());
            
            System.out.println(rh.recuperarServico(s1.getId()));

            
            
        case"7":
        	System.out.println("----------Adicionar Serviço a Colaborador--------");
        	int cont = 0;
        	System.out.println("Serviço: ");
        	String se = leitor.nextLine();
        	for (Servico x : rh.listaDeServico) {
    			if (se.equals(x.getNome())) {
    				fu.setSercol(x);
    			}
    		}
        	while (cont == 0) {
        		Funcao fuaux = new Funcao (fu);
        		System.out.println("Email Colaborador: ");
        		String emailcol = leitor.nextLine();
        		if (rh.associar(emailcol, fu.getSercol().getId()) == true) {
        			for (Colaborador col : rh.todosOsColaboradores) {
    					if (emailcol.equals(col.getEmail())) {
    						fuaux.setCol(col);
    						rh.listaDePares.add(fuaux);
    					}
    				}
        		}
        		
        		System.out.println("Deseja continuar: ");
        		String opcao = leitor.nextLine().toUpperCase();
        		if (opcao.equals("S")) {
        			continue;
        		}
        		else {
        			cont++;
        		}
        	}
        	for (Funcao listaF : rh.listaDePares) {
        		System.out.println(listaF);
    		}
        	

        	break;
        case"8":
        	System.out.println("--------Enviar email ao colaboradores--------");
        	
        	System.out.println("Qual Mensagem deve Ser enviada");
    //    	String msg = leitor.nextLine();
     //   	for(Colaborador emailAoC: rh.todosOsColaboradores) {
     //   		mensageiro.enviarMensagemAoColaborador(emailAoC, msg);
     //   	}    				
        	
        	
        	break;
        	
        case "9":
    		System.out.println("--------Gerar Relatorio--------");
    		
    		GeradorDeRelatorios.gerarRelatorio(rh.listaDeServico);
    		
        	break;
            
        case"S":
    		acabou = true;
    		break;
    }
       } while (!acabou );

      leitor.close(); 
        */
  }
  
}