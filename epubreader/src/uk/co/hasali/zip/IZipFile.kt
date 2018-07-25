package uk.co.hasali.zip

import java.io.Closeable
import java.io.File
import java.io.InputStream
import java.util.zip.ZipEntry

interface IZipFile : Closeable {

    fun getEntry(name: String?): IZipEntry?

    companion object {

        internal fun fromFile(file: File): IZipFile {
            return ZipFile(file)
        }

        internal fun fromInputStream(stream: InputStream): IZipFile {
            return ZipInputStream(stream)
        }
    }
}
