package abstractfactory.aws;

import abstractfactory.Instance;
import abstractfactory.Instance.Capacity;
import abstractfactory.ResourceFactory;
import abstractfactory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
