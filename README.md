#grpc Example

Python Client & Java Server

Install grpc libraries on python client machine
python -m pip install --upgrade pip
python -m pip install grpcio
python -m pip install grpcio-tools

python -m grpc_tools.protoc -I proto --python_out=src --grpc_python_out=src proto/HelloService.proto


