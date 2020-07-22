package Generics_tasks;

import java.io.InputStream;

public class ResourceUpdateProcessor <T extends ResourceReader> {

        public void doUpdateResource(T resource, InputStream stream) {
            resource.read(stream);
        }

}
