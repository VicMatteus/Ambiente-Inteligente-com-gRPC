import io.grpc.stub.StreamObserver;
public class ImplementacaoServidor extends atuadorGrpc.atuadorImplBase
{
	/**
	 * Essa classe implementa os métodos descritos como RPC no .proto;
	 * Será passada como serviço na hora de criar um servidor, para que o servidor consiga lidar com os chamados.
	 */
	
	/*Declarar um objeto aqui fora e tentar usá-lo dentro dos métodos resulta em um erro que não sei explicar.*/
	Arcondicionado arCondicionado = new Arcondicionado();
	private Lampada lampada = new Lampada();
	private Sprinkler sprinkler = new Sprinkler();
	
	@Override
	public void setTemp(GrpcServer.tempreq request, StreamObserver <GrpcServer.reqresponse> responseObserver)
	{
		boolean resOp = arCondicionado.setTemperatura(request.getTemperatura());
		System.out.println(resOp);
		GrpcServer.reqresponse reqresponse = GrpcServer.reqresponse.newBuilder()
			.setRetorno(resOp)
			.build();
		responseObserver.onNext(reqresponse);
		responseObserver.onCompleted();
	}
	
	public void ligarLamp(GrpcServer.alterReq request, StreamObserver <GrpcServer.reqresponse> responseObserver)
	{
		//virá true, caso a operação seja realizada; virá false, caso não. eg) ligar lampada já ligada = false.
		boolean resOp = lampada.ligarLampada();
		GrpcServer.reqresponse reqresponse = GrpcServer.reqresponse.newBuilder()
			.setRetorno(resOp)
			.build();
		responseObserver.onNext(reqresponse);
		responseObserver.onCompleted();
	}
	
	public void desligarLamp(GrpcServer.alterReq request, StreamObserver <GrpcServer.reqresponse> responseObserver)
	{
		//virá true, caso a operação seja realizada; virá false, caso não. eg) desligar lampada já desligada = false.
		GrpcServer.reqresponse reqresponse = GrpcServer.reqresponse.newBuilder()
			.setRetorno(lampada.desligarLampada())
			.build();
		responseObserver.onNext(reqresponse);
		responseObserver.onCompleted();
	}
	public void ligarSprink(GrpcServer.alterReq request, StreamObserver <GrpcServer.reqresponse> responseObserver)
	{
		//virá true, caso a operação seja realizada; virá false, caso não. eg) ligar sprinkler já ligado = false.
		GrpcServer.reqresponse reqresponse = GrpcServer.reqresponse.newBuilder()
			.setRetorno(sprinkler.ligarSprinkler())
			.build();
		
		responseObserver.onNext(reqresponse);
		responseObserver.onCompleted();
	}
	public void desligarSprink(GrpcServer.alterReq request, StreamObserver <GrpcServer.reqresponse> responseObserver)
	{
		GrpcServer.reqresponse reqresponse = GrpcServer.reqresponse.newBuilder()
			.setRetorno(sprinkler.desligarSprinkler())
			.build();
		
		responseObserver.onNext(reqresponse);
		responseObserver.onCompleted();
	}
}
