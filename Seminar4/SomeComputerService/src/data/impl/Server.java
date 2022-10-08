package data.impl;

import data.Computer;

public class Server extends Computer {

    private Server(ServerBuilder b) {
        super(b);
    }

    public static class ServerBuilder extends ComputerBuilder<ServerBuilder> {

        public ServerBuilder() {

        }

        @Override
        public Server build() {
            return new Server(this);
        }
    }
}
