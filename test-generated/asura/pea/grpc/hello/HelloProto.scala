// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package asura.pea.grpc.hello



object HelloProto extends _root_.com.trueaccord.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.com.trueaccord.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq(
    asura.pea.grpc.hello.HelloRequest,
    asura.pea.grpc.hello.HelloResponse
  )
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CgtoZWxsby5wcm90bxIOYXN1cmEucGVhLmdycGMiKgoMSGVsbG9SZXF1ZXN0EhoKCGdyZWV0aW5nGAEgASgJUghncmVldGluZ
  yIlCg1IZWxsb1Jlc3BvbnNlEhQKBXJlcGx5GAEgASgJUgVyZXBseTJXCgxIZWxsb1NlcnZpY2USRwoIU2F5SGVsbG8SHC5hc3VyY
  S5wZWEuZ3JwYy5IZWxsb1JlcXVlc3QaHS5hc3VyYS5wZWEuZ3JwYy5IZWxsb1Jlc3BvbnNlYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}