package com.ldaniels528.verify.util

import java.nio.ByteBuffer

/**
 * Byte Buffer Utilities
 * @author Lawrence Daniels <lawrence.daniels@gmail.com>
 */
object ByteBufferUtils {

  def toArray(buffer: ByteBuffer): Array[Byte] = {
    (for {
      buf <- Option(buffer)
      limit = buf.limit()
    } yield {
      val bytes = new Array[Byte](limit)
      buf.get(bytes)
      bytes
    }) getOrElse Array.empty
  }

}
