import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: grpcServer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class atuadorGrpc {

  private atuadorGrpc() {}

  public static final String SERVICE_NAME = "atuador";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcServer.tempreq,
      GrpcServer.reqresponse> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTemp",
      requestType = GrpcServer.tempreq.class,
      responseType = GrpcServer.reqresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcServer.tempreq,
      GrpcServer.reqresponse> getSetTempMethod() {
    io.grpc.MethodDescriptor<GrpcServer.tempreq, GrpcServer.reqresponse> getSetTempMethod;
    if ((getSetTempMethod = atuadorGrpc.getSetTempMethod) == null) {
      synchronized (atuadorGrpc.class) {
        if ((getSetTempMethod = atuadorGrpc.getSetTempMethod) == null) {
          atuadorGrpc.getSetTempMethod = getSetTempMethod =
              io.grpc.MethodDescriptor.<GrpcServer.tempreq, GrpcServer.reqresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.tempreq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.reqresponse.getDefaultInstance()))
              .setSchemaDescriptor(new atuadorMethodDescriptorSupplier("setTemp"))
              .build();
        }
      }
    }
    return getSetTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getLigarLampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ligarLamp",
      requestType = GrpcServer.alterReq.class,
      responseType = GrpcServer.reqresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getLigarLampMethod() {
    io.grpc.MethodDescriptor<GrpcServer.alterReq, GrpcServer.reqresponse> getLigarLampMethod;
    if ((getLigarLampMethod = atuadorGrpc.getLigarLampMethod) == null) {
      synchronized (atuadorGrpc.class) {
        if ((getLigarLampMethod = atuadorGrpc.getLigarLampMethod) == null) {
          atuadorGrpc.getLigarLampMethod = getLigarLampMethod =
              io.grpc.MethodDescriptor.<GrpcServer.alterReq, GrpcServer.reqresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ligarLamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.alterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.reqresponse.getDefaultInstance()))
              .setSchemaDescriptor(new atuadorMethodDescriptorSupplier("ligarLamp"))
              .build();
        }
      }
    }
    return getLigarLampMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getDesligarLampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "desligarLamp",
      requestType = GrpcServer.alterReq.class,
      responseType = GrpcServer.reqresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getDesligarLampMethod() {
    io.grpc.MethodDescriptor<GrpcServer.alterReq, GrpcServer.reqresponse> getDesligarLampMethod;
    if ((getDesligarLampMethod = atuadorGrpc.getDesligarLampMethod) == null) {
      synchronized (atuadorGrpc.class) {
        if ((getDesligarLampMethod = atuadorGrpc.getDesligarLampMethod) == null) {
          atuadorGrpc.getDesligarLampMethod = getDesligarLampMethod =
              io.grpc.MethodDescriptor.<GrpcServer.alterReq, GrpcServer.reqresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "desligarLamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.alterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.reqresponse.getDefaultInstance()))
              .setSchemaDescriptor(new atuadorMethodDescriptorSupplier("desligarLamp"))
              .build();
        }
      }
    }
    return getDesligarLampMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getLigarSprinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ligarSprink",
      requestType = GrpcServer.alterReq.class,
      responseType = GrpcServer.reqresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getLigarSprinkMethod() {
    io.grpc.MethodDescriptor<GrpcServer.alterReq, GrpcServer.reqresponse> getLigarSprinkMethod;
    if ((getLigarSprinkMethod = atuadorGrpc.getLigarSprinkMethod) == null) {
      synchronized (atuadorGrpc.class) {
        if ((getLigarSprinkMethod = atuadorGrpc.getLigarSprinkMethod) == null) {
          atuadorGrpc.getLigarSprinkMethod = getLigarSprinkMethod =
              io.grpc.MethodDescriptor.<GrpcServer.alterReq, GrpcServer.reqresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ligarSprink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.alterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.reqresponse.getDefaultInstance()))
              .setSchemaDescriptor(new atuadorMethodDescriptorSupplier("ligarSprink"))
              .build();
        }
      }
    }
    return getLigarSprinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getDesligarSprinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "desligarSprink",
      requestType = GrpcServer.alterReq.class,
      responseType = GrpcServer.reqresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcServer.alterReq,
      GrpcServer.reqresponse> getDesligarSprinkMethod() {
    io.grpc.MethodDescriptor<GrpcServer.alterReq, GrpcServer.reqresponse> getDesligarSprinkMethod;
    if ((getDesligarSprinkMethod = atuadorGrpc.getDesligarSprinkMethod) == null) {
      synchronized (atuadorGrpc.class) {
        if ((getDesligarSprinkMethod = atuadorGrpc.getDesligarSprinkMethod) == null) {
          atuadorGrpc.getDesligarSprinkMethod = getDesligarSprinkMethod =
              io.grpc.MethodDescriptor.<GrpcServer.alterReq, GrpcServer.reqresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "desligarSprink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.alterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcServer.reqresponse.getDefaultInstance()))
              .setSchemaDescriptor(new atuadorMethodDescriptorSupplier("desligarSprink"))
              .build();
        }
      }
    }
    return getDesligarSprinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static atuadorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<atuadorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<atuadorStub>() {
        @java.lang.Override
        public atuadorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new atuadorStub(channel, callOptions);
        }
      };
    return atuadorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static atuadorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<atuadorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<atuadorBlockingStub>() {
        @java.lang.Override
        public atuadorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new atuadorBlockingStub(channel, callOptions);
        }
      };
    return atuadorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static atuadorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<atuadorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<atuadorFutureStub>() {
        @java.lang.Override
        public atuadorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new atuadorFutureStub(channel, callOptions);
        }
      };
    return atuadorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class atuadorImplBase implements io.grpc.BindableService {

    /**
     */
    public void setTemp(GrpcServer.tempreq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    /**
     */
    public void ligarLamp(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLigarLampMethod(), responseObserver);
    }

    /**
     */
    public void desligarLamp(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDesligarLampMethod(), responseObserver);
    }

    /**
     */
    public void ligarSprink(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLigarSprinkMethod(), responseObserver);
    }

    /**
     */
    public void desligarSprink(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDesligarSprinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetTempMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcServer.tempreq,
                GrpcServer.reqresponse>(
                  this, METHODID_SET_TEMP)))
          .addMethod(
            getLigarLampMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcServer.alterReq,
                GrpcServer.reqresponse>(
                  this, METHODID_LIGAR_LAMP)))
          .addMethod(
            getDesligarLampMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcServer.alterReq,
                GrpcServer.reqresponse>(
                  this, METHODID_DESLIGAR_LAMP)))
          .addMethod(
            getLigarSprinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcServer.alterReq,
                GrpcServer.reqresponse>(
                  this, METHODID_LIGAR_SPRINK)))
          .addMethod(
            getDesligarSprinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcServer.alterReq,
                GrpcServer.reqresponse>(
                  this, METHODID_DESLIGAR_SPRINK)))
          .build();
    }
  }

  /**
   */
  public static final class atuadorStub extends io.grpc.stub.AbstractAsyncStub<atuadorStub> {
    private atuadorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected atuadorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new atuadorStub(channel, callOptions);
    }

    /**
     */
    public void setTemp(GrpcServer.tempreq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ligarLamp(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLigarLampMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void desligarLamp(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDesligarLampMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ligarSprink(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLigarSprinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void desligarSprink(GrpcServer.alterReq request,
        io.grpc.stub.StreamObserver<GrpcServer.reqresponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDesligarSprinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class atuadorBlockingStub extends io.grpc.stub.AbstractBlockingStub<atuadorBlockingStub> {
    private atuadorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected atuadorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new atuadorBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcServer.reqresponse setTemp(GrpcServer.tempreq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcServer.reqresponse ligarLamp(GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLigarLampMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcServer.reqresponse desligarLamp(GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDesligarLampMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcServer.reqresponse ligarSprink(GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLigarSprinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcServer.reqresponse desligarSprink(GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDesligarSprinkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class atuadorFutureStub extends io.grpc.stub.AbstractFutureStub<atuadorFutureStub> {
    private atuadorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected atuadorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new atuadorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcServer.reqresponse> setTemp(
        GrpcServer.tempreq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcServer.reqresponse> ligarLamp(
        GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLigarLampMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcServer.reqresponse> desligarLamp(
        GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDesligarLampMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcServer.reqresponse> ligarSprink(
        GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLigarSprinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcServer.reqresponse> desligarSprink(
        GrpcServer.alterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDesligarSprinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TEMP = 0;
  private static final int METHODID_LIGAR_LAMP = 1;
  private static final int METHODID_DESLIGAR_LAMP = 2;
  private static final int METHODID_LIGAR_SPRINK = 3;
  private static final int METHODID_DESLIGAR_SPRINK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final atuadorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(atuadorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((GrpcServer.tempreq) request,
              (io.grpc.stub.StreamObserver<GrpcServer.reqresponse>) responseObserver);
          break;
        case METHODID_LIGAR_LAMP:
          serviceImpl.ligarLamp((GrpcServer.alterReq) request,
              (io.grpc.stub.StreamObserver<GrpcServer.reqresponse>) responseObserver);
          break;
        case METHODID_DESLIGAR_LAMP:
          serviceImpl.desligarLamp((GrpcServer.alterReq) request,
              (io.grpc.stub.StreamObserver<GrpcServer.reqresponse>) responseObserver);
          break;
        case METHODID_LIGAR_SPRINK:
          serviceImpl.ligarSprink((GrpcServer.alterReq) request,
              (io.grpc.stub.StreamObserver<GrpcServer.reqresponse>) responseObserver);
          break;
        case METHODID_DESLIGAR_SPRINK:
          serviceImpl.desligarSprink((GrpcServer.alterReq) request,
              (io.grpc.stub.StreamObserver<GrpcServer.reqresponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class atuadorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    atuadorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("atuador");
    }
  }

  private static final class atuadorFileDescriptorSupplier
      extends atuadorBaseDescriptorSupplier {
    atuadorFileDescriptorSupplier() {}
  }

  private static final class atuadorMethodDescriptorSupplier
      extends atuadorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    atuadorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (atuadorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new atuadorFileDescriptorSupplier())
              .addMethod(getSetTempMethod())
              .addMethod(getLigarLampMethod())
              .addMethod(getDesligarLampMethod())
              .addMethod(getLigarSprinkMethod())
              .addMethod(getDesligarSprinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
