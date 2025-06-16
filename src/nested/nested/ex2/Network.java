package nested.nested.ex2;


public class Network {

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }


    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
