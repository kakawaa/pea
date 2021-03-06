package asura.pea.model

import asura.common.util.StringUtils

case class SimulationModel(
                            name: String,
                            protocols: Seq[String],
                            description: String = StringUtils.EMPTY
                          )
