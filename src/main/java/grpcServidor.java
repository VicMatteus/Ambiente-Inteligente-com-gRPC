import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
public class grpcServidor extends atuadorGrpc.atuadorImplBase
{
	private int port = 50052; //apenas a porta do servidor
	private Server server;
	
	public void start() throws IOException
	{
		server = ServerBuilder.forPort(port)
			.addService(new ImplementacaoServidor())
			.build()
			.start();
	}
	
	public void blockUntilShutdown() throws InterruptedException {
		if (server == null) {
			return;
		}
		
		server.awaitTermination();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		grpcServidor servidor = new grpcServidor();
		servidor.start();
		System.out.println("O servidor is up and running na porta " + servidor.port);
		servidor.blockUntilShutdown();
	}
}
