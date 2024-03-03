    package src.qqcommon;

    import java.io.Serializable;

    public class Message implements Serializable {
        private static final long serialVersionUID = 1L;
        private String sender;//发送者
        private String getter;//接收者
        private String content;//消息内容
        private String sendTime;//发送时间
        private String mesType;//消息类型


        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getGetter() {
            return getter;
        }

        public void setGetter(String getter) {
            this.getter = getter;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }

        public String getMesType() {
            return mesType;
        }

        public void setMesType(String mesType) {
            this.mesType = mesType;
        }
        public Message(){}
        public Message(String sender, String getter, String content, String sendTime, String mesType) {
            this.sender = sender;
            this.getter = getter;
            this.content = content;
            this.sendTime = sendTime;
            this.mesType = mesType;
        }
    }
