package studyJava.rocketmq;

import java.util.Date;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

public class Producer {
	
	public static void main(String[] args) throws MQClientException{
		DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
		producer.setNamesrvAddr("106.14.195.1:9876");
		producer.setInstanceName("producer");
		producer.start();
		try{
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				Message msg = new Message("TopicA-test","TagA",(new Date() + " Hello RocketMQ ,QuickStart" + i).getBytes());
				SendResult sendResult = producer.send(msg);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		producer.shutdown();
	}
	
	
	
}
