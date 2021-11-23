package com.uri.projeto_de_software.casodeuso;

import com.uri.projeto_de_software.casodeuso.constants.TipoCliente;
import com.uri.projeto_de_software.casodeuso.entities.*;
import com.uri.projeto_de_software.casodeuso.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Arrays;

@SpringBootApplication
public class CasoDeUsoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CasoDeUsoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");

		Produto p1 = new Produto("Computador", 2000.00);
		Produto p2 = new Produto("Impressora", 800.00);
		Produto p3 = new Produto("Computador", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		Cliente cliente1 = new Cliente("Marina Silva", "marina@gmail.com", TipoCliente.PESSOA_FISICA, "36378912377");

		Telefone telefone1 = new Telefone("27363323");
		Telefone telefone2 = new Telefone("93838393");

		cliente1.getTelefones().addAll(Arrays.asList(telefone1, telefone2));

		telefone1.setCliente(cliente1);
		telefone2.setCliente(cliente1);

		Endereco endereco1 = new Endereco("Rua Flores", "300", "Apto 203", "Jardim", "38220834");
		Endereco endereco2 = new Endereco("Av Mattos", "105", "Sala 800", "Centro", "3877012");

		cliente1.getEnderecos().addAll(Arrays.asList(endereco1, endereco2));
		endereco1.setCliente(cliente1);
		endereco2.setCliente(cliente1);

		Cidade cidade1 = new Cidade("Uberlândia");
		Cidade cidade2 = new Cidade("São Paulo");
		Cidade cidade3 = new Cidade("Campinas");

		endereco1.setCidade(cidade1);
		cidade1.getEnderecos().addAll(Arrays.asList(endereco1));
		endereco2.setCidade(cidade2);
		cidade2.getEnderecos().addAll(Arrays.asList(endereco2));

		Estado estado1 = new Estado("Minas Gerais");
		Estado estado2 = new Estado("São Paulo");

		cidade1.setEstado(estado1);
		cidade2.setEstado(estado2);
		cidade3.setEstado(estado2);

		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		clienteRepository.saveAll(Arrays.asList(cliente1));
		telefoneRepository.saveAll(Arrays.asList(telefone1, telefone2));
		enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));
		estadoRepository.saveAll(Arrays.asList(estado1, estado2));

	}
}
