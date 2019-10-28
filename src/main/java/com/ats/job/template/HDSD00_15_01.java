package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 住院医嘱子集
 */
public class HDSD00_15_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_15_01(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.72\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0052\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>住院医嘱</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <!--N-->\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\" displayName=\"女性\" />\n" +
                        "        <!--1数据集里是年龄（年）、年龄（月）-->\n" +
                        "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "      </patient>\n" +
                        "      <providerOrganization>\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"01\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 文档作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <!--医嘱开立日期时间：DE06.00.220.00 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE08_50_033_00") + "\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <code displayName=\"医嘱开立者\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <!-- 文档生成机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!--N:默认无，支持RPLC\\APND\\XFRM-->\n" +
                        "\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <code displayName=\"入院日期时间\"/>\n" +
                        "      <effectiveTime xsi:type=\"IVL_TS\" value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "      <location>\n" +
                        "        <healthCareFacility>\n" +
                        "          <serviceProviderOrganization>\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!-- DE01.00.026.00  病床号 -->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!-- DE01.00.019.00  病房号 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!-- DE08.10.026.00  科室名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                        <!-- DE08.10.054.00  病区名称 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                            <!--XXX医院 -->\n" +
                        "                            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                                <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "                                <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "                              </wholeOrganization>\n" +
                        "                            </asOrganizationPartOf>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </serviceProviderOrganization>\n" +
                        "        </healthCareFacility>\n" +
                        "      </location>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--生命体征章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8716-3\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"VITAL SIGNS\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.188.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体重\"/>\n" +
                        "              <!--N:定为生命体征，疑问-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"kg\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--医嘱章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <!--N:!!!-->\n" +
                        "          <code code=\"46209-3\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"Provider Orders\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.286.00\" displayName=\"医嘱类别\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_286_00") + "\" displayName=\"长期医嘱\" codeSystem=\"2.16.156.10011.2.3.2.58\" codeSystemName=\"医嘱类别代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.289.00\" displayName=\"医嘱项目类型\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                  <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_289_00") + "\" displayName=\"用药类医嘱\" codeSystem=\"2.16.156.10011.2.3.1.268\" codeSystemName=\"医嘱项目类型代码表\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.288.00\" displayName=\"医嘱项目内容\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                  <effectiveTime>\n" +
                        "                    <!--医嘱计划开始日期时间-->\n" +
                        "                    <low value=\"" + cdaData.getCustomCol("DE06_00_222_00") + "\"/>\n" +
                        "                    <!--医嘱计划结束日期时间-->\n" +
                        "                    <high value=\"" + cdaData.getCustomCol("DE06_00_219_00") + "\"/>\n" +
                        "                  </effectiveTime>\n" +
                        "                  <!--医嘱计划信息-->\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_288_00") + "</value>\n" +
                        "\n" +
                        "                  <!--作者：医嘱开立者-->\n" +
                        "                  <author>\n" +
                        "                    <!--医嘱开立日期时间：DE06.00.220.00-->\n" +
                        "                    <time value=\"" + cdaData.getCustomCol("DE06_00_222_00") + "\"/>\n" +
                        "                    <assignedAuthor>\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <code displayName=\"医嘱开立者\"/>\n" +
                        "                      <!--医嘱开立者签名：DE02.01.039.00-->\n" +
                        "                      <assignedPerson>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </assignedPerson>\n" +
                        "                      <!--医嘱开立科室：DE08.10.026.00-->\n" +
                        "                      <representedOrganization>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                      </representedOrganization>\n" +
                        "                    </assignedAuthor>\n" +
                        "                  </author>\n" +
                        "                  <!--医嘱审核-->\n" +
                        "                  <participant typeCode=\"ATND\">\n" +
                        "                    <!--医嘱审核日期时间：DE09.00.088.00-->\n" +
                        "                    <time value=\"" + cdaData.getCustomCol("DE06_00_088_00") + "\"/>\n" +
                        "                    <participantRole classCode=\"ASSIGNED\">\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <!--角色-->\n" +
                        "                      <code displayName=\"医嘱审核人\"/>\n" +
                        "                      <!--医嘱审核人签名：DE02.01.039.00-->\n" +
                        "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </playingEntity>\n" +
                        "                    </participantRole>\n" +
                        "                  </participant>\n" +
                        "                  <!--医嘱核对-->\n" +
                        "                  <participant typeCode=\"ATND\">\n" +
                        "                    <!--医嘱核对日期时间：DE06.00.205.00-->\n" +
                        "                    <time value=\"" + cdaData.getCustomCol("DE06_00_205_00") + "\"/>\n" +
                        "                    <participantRole classCode=\"ASSIGNED\">\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <!--角色-->\n" +
                        "                      <code displayName=\"医嘱核对人\"/>\n" +
                        "                      <!--医嘱核对护士签名：DE02.01.039.00-->\n" +
                        "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </playingEntity>\n" +
                        "                    </participantRole>\n" +
                        "                  </participant>\n" +
                        "                  <!--医嘱停止-->\n" +
                        "                  <participant typeCode=\"ATND\">\n" +
                        "                    <!--医嘱停止日期时间：DE06.00.218.00-->\n" +
                        "                    <time value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"/>\n" +
                        "                    <participantRole classCode=\"ASSIGNED\">\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <!--角色-->\n" +
                        "                      <code displayName=\"医嘱停止人\"/>\n" +
                        "                      <!--停止医嘱者签名：DE02.01.039.00-->\n" +
                        "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </playingEntity>\n" +
                        "                    </participantRole>\n" +
                        "                  </participant>\n" +
                        "                  <!--医嘱取消-->\n" +
                        "                  <participant typeCode=\"ATND\">\n" +
                        "                    <!--医嘱取消日期时间：DE06.00.234.00-->\n" +
                        "                    <time value=\"" + cdaData.getCustomCol("DE06_00_234_00") + "\"/>\n" +
                        "                    <participantRole classCode=\"ASSIGNED\">\n" +
                        "                      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                      <!--角色-->\n" +
                        "                      <code displayName=\"医嘱取消人\"/>\n" +
                        "                      <!--取消医嘱者签名：DE02.01.039.00-->\n" +
                        "                      <playingEntity classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </playingEntity>\n" +
                        "                    </participantRole>\n" +
                        "                  </participant>\n" +
                        "                  <!--医嘱备注信息-->\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE06.00.179.00\" displayName=\"医嘱备注信息\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_179_00") + "</value>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                  <!--医嘱执行状态-->\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE06.00.290.00\" displayName=\"医嘱执行状态\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_290_00") + "</value>\n" +
                        "                      <!--执行者-->\n" +
                        "                      <performer>\n" +
                        "                        <!--医嘱执行日期时间：DE06.00.222.00-->\n" +
                        "                        <time value=\"" + cdaData.getCustomCol("DE06_00_222_00") + "\"/>\n" +
                        "                        <assignedEntity>\n" +
                        "                          <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "                          <code displayName=\"医嘱执行者\"/>\n" +
                        "                          <!--医嘱执行者签名：DE02.01.039.00-->\n" +
                        "                          <assignedPerson>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                          </assignedPerson>\n" +
                        "                          <!--医嘱执行科室：DE08.10.026.00-->\n" +
                        "                          <representedOrganization>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                          </representedOrganization>\n" +
                        "                        </assignedEntity>\n" +
                        "                      </performer>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                  <!--电子申请单编号：例如检查检验申请单编号？？？-->\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE01.00.008.00\" displayName=\"电子申请单编号\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE01_00_008_00") + "</value>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                  <!--处方药品组号：例如如果是用药医嘱的话指向处方单号？？？-->\n" +
                        "                  <entryRelationship typeCode=\"COMP\">\n" +
                        "                    <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                      <code code=\"DE08.50.056.00\" displayName=\"处方药品组号\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                      <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_056_00") + "</value>\n" +
                        "                    </observation>\n" +
                        "                  </entryRelationship>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
