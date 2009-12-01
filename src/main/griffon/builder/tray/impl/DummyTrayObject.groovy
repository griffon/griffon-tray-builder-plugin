/* --------------------------------------------------------------------
   TrayBuilder
   Copyright (C) 2008-2009 Andres Almiray

   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public License as
   published by the Free Software Foundation; either version 2 of the
   License, or (at your option) any later version.

   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this library; if not, see <http://www.gnu.org/licenses/>.
   ---------------------------------------------------------------------
*/

package griffon.builder.tray.impl

import org.codehaus.groovy.runtime.NullObject

/**
 * @author Andres Almiray <aalmiray@users.sourceforge.com>
 */
class DummyTrayObject {
    private final storage = [:]

    void setProperty(String name, value) {
        storage[name] = value
    }

    def getProperty(String name) {
        storage[name]
    }

    def methodMissing(String name, args) {
        return NullObject.getNullObject()
    }
}