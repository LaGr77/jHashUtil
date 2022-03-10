package app.LaGr77.jHashUtil.util;

import java.io.File;

/**
 * File hash
 * @author Ladislav Grulich (LaGr77) <a href="mailto:aaa.bbb@gmail.com">[aaa.bbb@gmail.com]</a>
 * @version 0.1.0
 * @since 2022-02-02
 */
public class FileHash {
    /**
     * Constructor
     */
    public FileHash (Algo algo, File file) {
        setAlgo(algo);
        setFile(file);
    }

    /****************************************************************************************************
     *                                                                                          Get & Set
     ****************************************************************************************************/
    /**
     * Get variable Algorithm
     * @return {@link Algo}
     */
    public Algo getAlgo() {
        return algo;
    }

    /**
     * Set variable Algorithm
     * @param algo {@link Algo}
     */
    public void setAlgo(Algo algo) {
        this.algo = algo;
    }

    /**
     * Get file
     * @return {@link File}
     */
    public File getFile() {
        return file;
    }

    /**
     * Set file
     * @param file {@link File}
     */
    public void setFile(File file) {
        this.file = file;
    }
     
    /****************************************************************************************************
     *                                                                                          Variables
     ****************************************************************************************************/
    private Algo algo;
    private File file;
}
