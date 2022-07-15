# Codigos-Java
Codigos de Java do curso da Digital House

Encapsulamento --

** Ocultação dos dados

** Facilita a manutenção do código

** Reuso

--> Serviços (métodos) getters and setters

getters -> recuperação do atributo

setters -> modificação do atributo

--> Visibilidade

public -> objetos de outras classes possuem acesso direto

protected -> o acesso é restrito as Classes de mesmo pacote

private -> o acesso é restrito ao interior da classe

public void setModelo(String model){...} // criando um método para modificar um atributo privado

public String getModelo(){return modelo} // criando um método para recuperar um atributo que foi modificado

Pra fazer automaticamente os getters and setters: botão direito -> source -> generate getters and setters
