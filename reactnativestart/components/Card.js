import { View, Text } from "react-native";

export default function Card({ styles }) {
  return (
    <View style={styles.card}>
      <Text>React Native</Text>
      <Text>Criando aplicação em react native.</Text>
    </View>
  );
}