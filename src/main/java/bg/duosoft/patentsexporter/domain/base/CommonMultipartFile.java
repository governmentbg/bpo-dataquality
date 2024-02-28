package bg.duosoft.patentsexporter.domain.base;

import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@AllArgsConstructor
public class CommonMultipartFile implements MultipartFile {
    private String name;
    private String originalName;
    private String contentType;
    private byte[] content;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOriginalFilename() {
        return originalName;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public boolean isEmpty() {
        return content == null || content.length == 0;
    }

    @Override
    public long getSize() {
        return content.length;
    }

    @Override
    public byte[] getBytes() {
        return content;
    }

    @Override
    public InputStream getInputStream() {
        return new ByteArrayInputStream(content);
    }

    @Override
    public void transferTo(File destination) throws IOException, IllegalStateException {
        try (FileOutputStream fos = new FileOutputStream(destination)) {
            fos.write(content);
        }
    }
}
